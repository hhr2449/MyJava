import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;
//使用import导入java标准库中util包下面的Scanner类

public class Hello {//Hello类，注意类名必须与文件名一致，首字母大写

    public void methodA() {
        System.out.println("this is methodA");
    }
    public void methodB() {
        methodA();
        System.out.println("this is methodB");
    }
    public static void methodC() {
        System.out.println("this is methodC");
        //methodA();
    }
    //同一个类里面可以有多种方法，这些方法之间可以直接互相调用
    //但是静态方法只能调用静态方法，不能调用实例方法

    public static void main(String args[]) {//主方法
        //Scanner是java中用于标准输入输出的一个类，这里是在创建一个Scanner类的对象
        Scanner scanner = new Scanner(System.in);
        //创建一个Scanner对象，对象名是scanner
        var name = scanner.nextLine();
        //表示读取一整行输入
        var name2 = scanner.next();
        //表示读取一个单词
        //var是自动类型推导
        System.out.println(name);
        System.out.println("Hello World");
        //methodA();
        Hello hello = new Hello();
        hello.methodB();
        //静态方法里面不能直接调用非静态方法，但是可以先创建一个对象，然后调用对象里面的非静态方法
        methodC();
        //可以调用其他类中的方法，只要创建要调用的方法所在类的对象即可
        Main main = new Main();
        main.method();


        //文件的输入输出
        PrintWriter fileOut = null;
        try {
            fileOut = new PrintWriter("D:\\MyJava\\learnJava\\intAndOut\\test.txt", "UTF-8");
            fileOut.println("Hello World");
        }
        catch(Exception e) {
            System.out.println("文件打开失败");
        }
        finally {
            if(fileOut != null) {
                fileOut.close();
            }
        }
        //path为文件路径
        //创建一个Scanner对象，用于读取文件
        Scanner fileIn = null;
        try {
            String path;
            //注意路径中的\需要转义
            path = "D:\\MyJava\\learnJava\\intAndOut\\test.txt";
            fileIn = new Scanner(Paths.get(path), "UTF-8");
            //创建成功后就可以正常使用Scanner对象来读取文件，与控制台输入一样
            String str = fileIn.nextLine();
            System.out.println(str);
        }
        catch(Exception e) {
            System.out.println("文件打开失败");
        }
        finally {
            if(fileIn != null) {
                fileIn.close();
            }
        }




    }
}
