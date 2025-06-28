    class Variable {
    int x = 0,y = 0,z = 0;
    void init() {
        this.x = 20;
        this.y = 30;
        int z = 5;
        System.out.println("x=" + x + ",y=" + y + ",z=" + z);
    }
}
public class VariableTest {
    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println("x=" + v.x + ",y=" + v.y + ",z=" + v.z);
        v.init();
        System.out.println("x=" + v.x + ",y=" + v.y + ",z=" + v.z);
    }
}
