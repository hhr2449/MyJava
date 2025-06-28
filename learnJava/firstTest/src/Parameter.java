
public class Parameter {
    int value = 0;
    static void addInt(int a) {
        a++;
    }
    static void addP(Parameter p) {
        p.value++;
    }
    public static void main(String[] args) {
        Parameter p = new Parameter();
        addInt(p.value);
        System.out.println(p.value);
        addP(p);
        System.out.println(p.value);
    }
}
