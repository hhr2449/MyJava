import java.util.Scanner;

class Test2 {
    void method1() throws Exception{
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        if(s.length() > 8) {
            throw new Exception("Length is greater than 8");
        }
    }

    void method2() throws Exception {
        method1();
    }

    void method3() throws Exception {
        method2();
    }
    void method4() {
        try {
            method3();
        }
        catch (Exception e) {
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
