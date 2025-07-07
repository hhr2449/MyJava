import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodingConversion {
    //使用字节流FileOutputStream来创建字符流OutputStreamWriter，并指定编码格式为GBK
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("Test.txt"), "GBK")) {
            writer.write("Hello world/n");
            writer.write("你好，世界");
            char[] b = "我要测试中文编码格式".toCharArray();
            writer.write(b);
            writer.flush();
            System.out.println("写入编码为" + writer.getEncoding());
            System.out.println("------------------");


        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("Test.txt"), "utf-8")) {
            char[] b = new char[1024];
            int len = reader.read(b);
            System.out.println("字符串长度为：" + len);
            System.out.println(new String(b, 0, len));
            System.out.println("读取编码为" + reader.getEncoding());
            System.out.println("------------------");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (InputStreamReader reader = new InputStreamReader(new FileInputStream("Test.txt"), "GBK")) {
            char[] b = new char[1024];
            int len = reader.read(b);
            System.out.println("字符串长度为：" + len);
            System.out.println(new String(b, 0, len));
            System.out.println("读取编码为" + reader.getEncoding());
            System.out.println("------------------");
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
