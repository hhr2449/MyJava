public class GenericClass<T> {
    //成员变量使用泛型参数
    private T value;
    //构造方法使用泛型参数
    public GenericClass (T value) {
        this.value = value;
    }
    //函数返回值使用泛型参数
    public T getKey() {
        return value;
    }

    //注意前面的方法都只是使用了泛型类中的泛型参数，下面才是一个泛型方法，应该在返回值前面使用尖括号来声明泛型参数
    //注意类定义的泛型参数和方法定义的泛型参数是完全独立的
    public <U> U test(U u) {
        System.out.println(u);
        return u;
    }
    //泛型方法的泛型参数可以和类的相同，此时以方法为准
    public <T> T test2(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        //使用Integer作为泛型参数
        GenericClass<Integer> genericClass = new GenericClass<Integer>(123);
        System.out.println(genericClass.getKey());
        //使用String作为泛型参数
        GenericClass<String> genericClass2 = new GenericClass<String>("hello world");
        System.out.println(genericClass2.getKey());
        //使用泛型方法无需指定泛型参数，编译器会根据传入的参数自动确定
        System.out.println(genericClass2.test("hello world"));
        System.out.println(genericClass2.test2(123.1));

    }

}
