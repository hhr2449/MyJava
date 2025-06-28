public class Constructor {
    int x, y;
    Constructor(int x,int y) {
        this.x = x;
        this.y = y;
        System.out.println(this.toString() + "构造方法1调用");
    }
    Constructor(int x) {
        this.x = x;
        this.y = y;
        System.out.println(this.toString() + "构造方法2调用");
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(10, 20);
        Constructor c2 = new Constructor(30);
    }
}
