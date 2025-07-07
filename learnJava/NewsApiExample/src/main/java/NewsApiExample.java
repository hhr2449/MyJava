import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class NewsApiExample {

    public static void main(String[] args) {
        // API 请求地址
        String url = "https://api2.newsminer.net/svc/news/queryNewsList" +
                "?size=10&startDate=2024-07-01&endDate=2024-08-30" +
                "&words=新华社，环境保护&categories=科技&page=1";

        // 创建 OkHttpClient
        // OkHttpClient是用于发送请求的客户端对象
        OkHttpClient client = new OkHttpClient();

        // 构建请求
        // request是请求对象，用于描述发送的Http请求
        //使用了OkHttp提供的构建器模式，url是请求的地址，.build()方法构建出请求的对象
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            // 同步发送请求
            //response是响应对象，用于描述请求得到的响应
            //client.newCall(request) 创建一个Call类型对象，代表一次http网络请求
            //参数是请求对象，表示该网络请求的内容
            //execute() 方法发送请求并获取响应
            Response response = client.newCall(request).execute();

            //如果请求成功，那么response的body里面就包含了我们要的新闻数据，格式为jason
            if (response.isSuccessful()) {
                // 获取返回的 JSON 字符串
                String json = response.body().string();

                // 打印原始 JSON 字符串
                System.out.println("原始JSON：\n" + json.substring(0, Math.min(500, json.length())) + "...\n");

                // 使用 Gson 解析
                Gson gson = new Gson();
                //接受一个json字符串，返回指定类型的对象
                //这里转换采用了字符串匹配，将json字符串的字段按照字段名与类的成员变量进行匹配
                //如果字段名和成员变量的名字一样，那么字段值就会自动赋给成员变量
                NewsResponse newsResponse = gson.fromJson(json, NewsResponse.class);

                // 遍历新闻数据
                System.out.println("新闻列表：");
                for (NewsItem item : newsResponse.data) {
                    System.out.println("标题：" + item.title);
                    System.out.println("时间：" + item.publishTime);
                    System.out.println("类型：" + item.category);
                    System.out.println("简介：" + item.content.substring(0, Math.min(50, item.content.length())) + "...");
                    System.out.println("关键词：" );
                    for (KeyWord keyWord : item.keywords) {
                        System.out.println("  " + keyWord.word);
                    }
                    System.out.println("发布组织：" );
                    for (Organizations organization : item.organizations) {
                        System.out.println("  " + organization.mention);
                    }
                    System.out.println("地点：");
                    for (Location location : item.locations) {
                        System.out.println("  " + location.mention);
                    }
                    System.out.println("-------------------------");
                }

            } else {
                System.out.println("请求失败，状态码：" + response.code());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // JSON 数据结构类
    //定义了用来接受json解析结果的类
    static class NewsResponse {
        //每一条新闻字段名为data，这里设置了名为data的列表，那么一条新闻数据就会成为列表中的一个元素
        List<NewsItem> data;
    }

    static class Organizations {
        String mention;
        String count;
    }


    static class KeyWord {
        String word;
        String score;
    }

    static class Location {
        String mention;
    }



    static class NewsItem {
        String title;
        String publishTime;
        List<KeyWord> keywords;
        List<Organizations> organizations;
        List<Location> locations;
        String content;
        String category;
        String image;
        String video;
    }
}
