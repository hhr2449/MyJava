import java.io.*;

public class BufferStream {
    public static void main(String[] args) {
        // 创建缓冲流,这里使用套接用法，在字节流外面套了一个转换流，再套一个缓冲流
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(
                        "Test.txt"),"utf-8"
                )
        )){
            writer.write("第一行内容");
            //输入跨平台换行符
            writer.newLine();
            writer.write("第二行内容");
            writer.newLine();
            writer.write("第三行内容");
            //注意缓冲流必须要刷新或是关闭，否则内容不会写入硬盘
            writer.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //使用缓冲流读取文件
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("Test.txt"),"utf-8")
        )){
            String line = null;
            //提供了更加快捷的readLine方法，可以读取整行的内容，如果读到文件末尾就返回null
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
