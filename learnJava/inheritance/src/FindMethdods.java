class SuperClass1{
    public static void SMethods() {
        System.out.println("SuperClass1 static method");
    }
    public void method1(){
        System.out.println("SuperClass1 method1");
    }
}

class SuperClass2 extends SuperClass1{
    public static void SMethods() {
        System.out.println("SuperClass2 static method");
    }
    @Override
    public void method1(){
        System.out.println("SuperClass2 method1");
    }
}

class SubClass1 extends SuperClass2{
    public static void SMethods() {
        System.out.println("SubClass1 static method");
    }
}
class SubClass2 extends SuperClass2{
    public static void SMethods() {
        System.out.println("SubClass2 static method");
    }
}

public class FindMethdods {
    public void test(){
        SuperClass1 s = new SubClass1();
        s.method1();
        //s.SMethods();
        SubClass1 s1 = new SubClass1();
        SubClass2 s2 = new SubClass2();
    }
    public static void main(String[] args) {
        new FindMethdods().test();
    }
}
