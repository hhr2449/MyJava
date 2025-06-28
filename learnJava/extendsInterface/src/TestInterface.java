//Shape接口
interface Shape{
    double pi = 3.14;
    void setColor(String c);
}
//Shape接口派生出Shape2D和Shape3D接口
interface Shape2D extends Shape {
    void area();
}

interface Shape3D extends Shape {
    void volunme();
}
//实现接口
class Circle implements Shape2D {
    private String color;
    private double radius;
    @Override
    public void setColor(String c) {
        System.out.println("Circle: " + c);
        color = c;
    }
    @Override
    public void area() {
        System.out.println("Area of " + color + " circle is " + pi * radius * radius);
    }
    public void setRadius(double r) {
        radius = r;
    }

}

class Sphere implements Shape3D {
    private String color;
    private double radius;
    @Override
    public void setColor(String c) {
        System.out.println("Sphere: " + c);
        color = c;
    }
    @Override
    public void volunme() {
        System.out.println("volunme of " + color + " sphere is " + 3 * pi * radius * radius * radius/4);
    }
    public void setRadius(double r) {
        radius = r;
    }
}

class m extends Sphere {
}

public class TestInterface {
    public static void main(String[] args) {
        //可以使用接口变量来引用实现了接口的对象
        Shape s = new Circle();
        Shape s1 = new Sphere();
        //可以使用接口变量来调用接口方法，并且可以根据实际指向的对象来实现多态调用
        s.setColor("red");
        s1.setColor("blue");
        //接口变量可以强制转换为实际指向的对象或其父类的引用
        Circle c = (Circle)s;
        Sphere sp = (Sphere)s1;
        c.setRadius(5.0);
        sp.setRadius(5.0);
        c.area();
        sp.volunme();
    }
}
