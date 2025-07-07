import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try {
            //以读写模式打开
            java.io.RandomAccessFile raf = new RandomAccessFile("Test.txt","rw");
            //获取文件指针的位置
            System.out.println(raf.getFilePointer());
            //获取文件大小
            System.out.println(raf.length());
            //将指针移动到第10个字节处
            raf.seek(10);
            System.out.println(raf.getFilePointer());
            //读取发现读出了第11个字节
            System.out.println((char)raf.read());
            //继续读取，读出了第12个字节
            System.out.println((char)raf.read());
            //写入数据，发现在第13个子接触写入了a
            raf.write('a');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
