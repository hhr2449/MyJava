public class Person2 {
    private int blood;
    private int iQ;
    //注意这里存的只是引用，要在构造函数中构造这两个对象
    private Heart heart;
    private Brain brain;
    //将心和脑都设为内部类，这样成员方法可以直接访问成员变量，调用更加方便
    //而且内部类只在Person类中有效，这样增强了封装性
    public class Heart{
        public void beat()
        {
            System.out.println("I am beating, blood " + blood);
        }
    }
    public class Brain{
        public void think()
        {
            System.out.println("I am thinking, iQ " + iQ);
        }
    }
    Person2() {
        iQ = 100;
        blood = 100;
        heart = new Heart();
        brain = new Brain();
    }

    public static void main(String[] args) {
        Person2 p = new Person2();
        p.heart.beat();
        p.brain.think();
    }

}
