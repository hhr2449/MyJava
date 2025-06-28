class Heart{
    public void beat(Person1 p) {
        System.out.println("I am beating" + "blood" + p.getBlood());
    }
}

//Brain类，里面有方法think,需要调用IQ，此时则需要将Person类作为参数传入，并且需要在Person类中定义获取IQ的方法
class Brain{
    public void think(Person1 p) {
        System.out.println("I am thinking" + "IQ" + p.getIQ());
    }
}

//而且Brain和Heart类都是独立的类，封装性没那么好，其他类也可以访问


//Person类，里面有两个器官：心脏和大脑，需要使用类来进行描述，还有blood和IQ两个成员变量
public class Person1 {
    private int blood;
    private int IQ;
    private Heart heart;
    private Brain brain;
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public int getIQ() {
        return IQ;
    }
    public void setIQ(int iQ) {
        IQ = iQ;
    }
    Person1() {
        blood = 100;
        IQ = 100;
        heart = new Heart();
        brain = new Brain();
        System.out.println("I am born");
    }

    public static void main(String[] args) {
        Person1 p = new Person1();
        p.heart.beat(p);
        p.brain.think(p);
    }

}
