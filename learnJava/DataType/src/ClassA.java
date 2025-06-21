import java.util.Scanner;
public class ClassA {
    /*
    枚举类实质上就是一个特殊的类
    枚举出来的变量是类中的静态成员对象
    枚举类中可以定义成员函数
     */
    enum Color{
        RED, GREEN, BLUE;
        public void print() {
            //name()是枚举类中的方法，表示返回当前枚举变量的名称
            System.out.println("颜色是" + this.name());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //byte表示-128~127的数据
        byte b = 127;
        //这里将字符转为对应的ASCLL码值
        byte b1 = 'a';
        //short和int与cpp类似
        short s = 32767;
        int i = 131242141;
        //注意：对于一个整数，java会默认其为int型，
        //所以即使想要创建的是一个long，数字过大仍然会报错
        //这时候就要在数字后面加上L来表示这是一个长整型
        long l = 123123123123123L;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        //float也是类似的，默认为double型
        float f = 1213.21421f;
        double d = 123123123123.123123123123;
        System.out.println(f);
        System.out.println(d);

        char c = 'a';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);
        //int a = bool;注意java中不能将boolean转为int型


        //想要输入变量的值：
        //创建一个Scanner对象，然后使用nextXXX()方法
        bool = scanner.nextBoolean();
        int a;
        a = bool ? 1 : 0;
        System.out.println(a);
        //创建枚举类对象
        Color color = Color.RED;
        //可以直接输出
        System.out.println(color);
        //可以调用成员函数
        color.print();

    }
}
