import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLtest {
    public static void main(String[] args) {
        try {
            //构造对象
            URL url = new URL("https://baijiahao.baidu.com/s?id=1836981599963269833&wfr=spider&for=pc");
            //获取参数
            System.out.println(url.getProtocol());//获取协议
            System.out.println(url.getHost());//获取主机名
            System.out.println(url.getPort());//获取端口号
            System.out.println(url.getPath());//获取路径
            System.out.println(url.getQuery());//获取参数
            System.out.println(url.getFile());//获取文件名
            System.out.println(url.getRef());

            //读写资源
            //建立连接
            URLConnection connection = url.openConnection();

            //设置超时（如果请求超过设置的事件，会抛出异常）
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            //设置请求头
            //User-Agent表示请求是由Java应用程序发出的
            connection.setRequestProperty("User-Agent", "JavaApp/1.0");
            //Accept表示请求希望获得json类型的数据
            connection.setRequestProperty("Accept", "application/json");

            //启用输入输出流
            //想要从url获取数据，必须设置doInput为true
            connection.setDoInput(true);

            //显式启动连接
            connection.connect();


            //读取数据，通过getInputStream()方法获取字节流，再进行包装
            try(BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            connection.getInputStream()
                    )
            )) {

                String line;
                //逐行读取
                while((line = reader.readLine()) != null) {
                    System.out.println(line);

                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }






        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
