import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStream {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("D:\\MyJava\\learnJava\\File\\Test.txt");){

            writer.write("Hello world/n");
            writer.write("你好，世界");
            char[] b = "(@^0^@)/的卡哇咔咔".toCharArray();
            writer.write(b);
           // writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            Reader reader = new FileReader("D:\\MyJava\\learnJava\\File\\Test.txt");
            char[] b = new char[10240];
            int len = reader.read(b);
            System.out.println("字符串长度为：" + len);
            System.out.println(new String(b, 0, len));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
