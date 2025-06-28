public class Test {
    public static void main(String[] args) {
        System.out.println(9/2);
        System.out.println(5/2.0);
        byte x = 4, y = 3;
        long z = 80L;
        System.out.println(z/y);
        System.out.println(x*y);
        A a = new A();
        if(a instanceof A) {
            System.out.println("a是A的实例");
        }
        //输出浮点数的最大值
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.NaN);
        String s1 = new String("a");
        String s2 = new String("a");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        String s3 = "a";
        String s4 = "a";
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
class A{

}