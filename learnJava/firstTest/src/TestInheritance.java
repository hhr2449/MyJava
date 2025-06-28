class SuperClass{
    int x;
    void setX() {
        this.x = 10;
    }
    SuperClass() {
        System.out.println("SuperClass()调用");
    }
    SuperClass(int a) {

        System.out.println("SuperClass(int a)调用");
    }
    void doSomething() {
        System.out.println("doSomething in SuperClass");
    }
}
class SubClass extends SuperClass{
    int x;
    @Override
    void setX(){
        this.x = 20;
    }
    SubClass(){
        super(10);
        super.setX();
        System.out.println("SubClass()调用");
    }
    @Override
    void doSomething(){
        System.out.println("doSomething in SubClass");
    }
}

public class TestInheritance{
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
        
    }
}
