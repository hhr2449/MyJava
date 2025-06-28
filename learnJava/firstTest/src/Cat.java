public class Cat {
    int hunger;
    void eat(){

    }
    void sleep(){

    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.getClass());
        System.out.println(c2.getClass());
    }
}
