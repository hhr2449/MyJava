import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        //静态常量：文件分隔符
        System.out.println("pathSeparator:"+ File.pathSeparator);
        System.out.println("pathSeparatorChar:"+ File.pathSeparatorChar);
        System.out.println("Separator:" + File.separator);
        System.out.println("SeparatorChar:" + File.separatorChar);
        //使用路径来构造
        File f = new File("D:\\MyJava\\firstTest");
        //判断是否存在
        System.out.println("isExist:" + f.exists());
        //判断是否是文件
        System.out.println("isFile:" + f.isFile());
        //获取名字
        System.out.println("getName:" + f.getName());
        //获取路径
        System.out.println("getPath:" + f.getPath());
        //获取绝对路径
        System.out.println("getAbsolutePath:" + f.getAbsolutePath());
        //获取上一级目录名
        System.out.println("getParent:" + f.getParent());
        //获取文件列表
        String[] fileList = f.list();
        for(String s : fileList) {
            System.out.println(s);
        }
        //获取目录下文件对象
        File[] fileList2 = f.listFiles();
        for(File file : fileList2) {
            System.out.println(file.getName());
        }
        //创建目录
        File f2 =  new File("D:\\MyJava\\firstTest\\test");
        f2.mkdir();
        if(f2.exists()) {
            System.out.println("创建成功");
        }
        //创建文件
        File f3 = new File("D:\\MyJava\\firstTest\\test\\main.cpp");
        try{
            f3.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if(f3.exists()) {
            System.out.println("创建成功");
        }
        //删除文件
        f3.delete();
        if(!f3.exists()){
            System.out.println("删除成功");
        }
        //删除目录
        f2.delete();
        if(!f2.exists()) {
            System.out.println("删除成功");
        }
        //目录改名
        File f4 = new File("D:\\MyJava\\FirstTest");
        f.renameTo(f4);
        //获取文件大小
        for(File file : fileList2) {
            System.out.println("the length of " + file.getName() + " is " + file.length());
        }

    }
}
