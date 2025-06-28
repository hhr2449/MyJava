class SuperClass {
    int x = 2;
    public void print1() {
        System.out.println("SuperClass,x=" + x);
    }
    public void add1() {
        x += 2;
    }
}

class SubClass extends SuperClass {
    int x = 100;
    public void print2() {
        System.out.println("SubClass,x=" + x);
    }
    public void add2() {
        x += 2;
    }
}

public class Hide {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.print1();
        sc.print2();
        sc.add1();
        sc.print1();
        sc.print2();
        sc.add2();
        sc.print1();
        sc.print2();

    }
}
