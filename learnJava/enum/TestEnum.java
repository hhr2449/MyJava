enum Color{
    //枚举常量就是static final类型的对象
    //在创建枚举常量的时候可以调用构造方法，也可以重写抽象方法
    //枚举常量之间以逗号分割，最后加分号
    RED("red", 1) {
        @Override
        public String getDescription() {
            return "This is a red color";
        }
    },
    GREEN("green", 2) {
        @Override
        public String getDescription() {
            return "This is a green color";
        }
    },
    BLUE("blue", 3) {
        @Override
        public String getDescription() {
            return "This is a blue color";
        }
    };


    //枚举类中可以设置成员变量
    private String name;
    private int value;
    //枚举类中可以设置构造方法，但是一定要是私有的，在创建枚举常量的时候可以调用构造方法
    private Color(String name, int value) {
        this.name = name;
        this.value = value;
    }
    //可以定义普通方法
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    //可以定义抽象方法，但是在定义枚举常量的时候必须实现该方法
    public abstract String getDescription();
    //可以定义静态方法
    public static Color getColor(int value) {
        for(Color c:values()) {
            if(c.getValue() == value) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid value");
    }
    @Override
    public String toString() {
        return "Color" + name + "(" + value + ")";
    }

}

public class TestEnum {
    public static void main(String[] args) {
        //因为是静态对象，所以可以直接用类名来获取枚举对象（枚举类一般不会单独定义新的对象）
        Color red = Color.RED;
        System.out.println(red);
        System.out.println(red.getName());
        System.out.println(red.getValue());
        System.out.println(red.getDescription());
        for(Color c:Color.values()) {
            System.out.println(c);
        }
        System.out.println(Color.getColor(1));

    }
}
