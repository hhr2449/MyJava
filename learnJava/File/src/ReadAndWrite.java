import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            //使用文件地址来初始化一个FileInputStream对象
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            int data;
            System.out.println("the content of file is: ");
            //read()方法用于挨个读取，返回的值是字节的ASCII码值，如果读到文件末尾就返回-1
            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            byte[] b = new byte[10];
            int len;
            System.out.println("");
            System.out.println("the content of file is:");
            //read(byte[] b)方法用于批量读取，将读到的字节储存进数组b中
            // 返回值是实际读取的字节数，实际读取到的字节数是文件中的可读字节数和b的容量中的最小值
            while((len = fis.read(b)) != -1) {
                System.out.print("这次读到的字节数是： " + len + " ");
                System.out.println(new String(b, 0, len));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            byte[] b = new byte[10];
            System.out.println("可读字节数： ");
            //使用available()方法获取可读字节数
            System.out.println(fis.available());
            System.out.println("现在跳过10个");
            //使用skip()方法可以跳过一定的字节数，返回值是实际跳过的字节数
            fis.skip(10);
            System.out.println("跳过后的可读字节数： " + fis.available());
            System.out.println("现在开始读取");
            int len;
            //使用read(byte[] b, int off, int len)方法,从数组b的索引off出开始放置，每次最多放len个
            while((len = fis.read(b, 3, 5)) != -1) {
                System.out.print("这次读到的字节数是： " + len + " ");
                System.out.println(new String(b, 3, len));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }


        try {
            FileOutputStream ofs = new FileOutputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档 (2).txt");
            ofs.write(97);
            ofs.write(98);
            String content = "你好，世界";
            String content2 = "去问人体托盘的可能空间";
            byte[] b = content.getBytes("UTF-8");
            byte[] b2 = content2.getBytes();
            ofs.write(b);
            ofs.write(b2,0,5);

        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件写入错误");
            e.printStackTrace();
        }
    }
}
