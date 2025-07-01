class Test2 {
    void method1() throws ArrayIndexOutOfBoundsException{
        int[] a = new int[4];
        System.out.println(a[5]);
        System.out.println("Inside method1");
    }

    void method2() {
        method1();
    }

    void method3() {
        method2();
    }
    void method4() {
        try {
            method3();
        }
        catch (ArithmeticException e) {
            System.out.println("Caught");
            e.getMessage();
            e.printStackTrace();
        }
    }
}

public class TryCatch {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.method4();
    }
}
