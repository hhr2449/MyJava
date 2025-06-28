abstract class Animal {
    public abstract void move (String destination);
    public abstract void drink ();
}

abstract class Mammel extends Animal {
}

abstract class Raptile extends Animal {

}

interface Hunt{
    public void hunt();
}

class tiger extends Mammel implements Hunt{
    private static String name = "tiger";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }

}

class Rabbit extends Mammel {
    private static String name = "rabbit";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
}

class snake extends Raptile implements Hunt{
    private static String name = "snake";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
    @Override
    public void hunt() {
        System.out.println(name + " is hunting");
    }
}

class turtle extends Raptile {
    private static String name = "turtle";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
 }


public class Famer {
    public void bringWater(String  destination) {
        System.out.println("Bring water to " + destination);
    }
    public void feedWater(Animal animal, String destination) {
        bringWater(destination);
        animal.move(destination);
        animal.drink();
    }
    public void bringFood(String destination) {
        System.out.println("Bring food to " + destination);
    }
    //使用接口变量来传递实现了接口的类的引用
    public void feedFood(Hunt hunter, String destination) {
        bringFood(destination);
        //实现类型转换
        Animal animal = (Animal) hunter;
        animal.move(destination);
        //使用接口类型变量来调用接口中的方法可以实现多态调用
        hunter.hunt();
    }
    public static void main(String[] args) {
        Famer famer = new Famer();
        famer.feedWater(new tiger(), "home");
        famer.feedWater(new Rabbit(), "home");
        famer.feedWater(new snake(), "home");
        famer.feedWater(new turtle(), "home");
        famer.feedFood(new tiger(), "home");
        famer.feedFood(new snake(), "home");
    }
}
