class M{
    M() {
        System.out.println("M()");
    }
    public void callMe() {
        System.out.println("callMe in M");
    }
}
class N extends M {
    N() {
        super();
        System.out.println("N()");
    }
    @Override
    public void callMe() {
        System.out.println("callMe in N");
    }
}
public class Poly {
    public static void main(String[] args) {
        M m = new N();
        m.callMe();
    }
}
