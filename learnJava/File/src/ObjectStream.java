import java.io.*;

class A implements Serializable{
    int m;
    public A(int m) {
        this.m = m;
    }
}

class Student implements Serializable {
    String name;
    int age;
    transient int id;
    String address;
    A a;
    public Student(String name, int age, int id, String address, A a) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.address = address;
        this.a = a;
    }
}


public class ObjectStream {
    public static void main(String[] args) {
        A a = new A(10);
        Student stu = new Student("张三", 18, 1001, "北京", a);
        try {
            FileOutputStream fout = new FileOutputStream("stu.txt");
            ObjectOutputStream os = new ObjectOutputStream(fout);
            os.writeObject(stu);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("stu.txt");
            ObjectInputStream os = new ObjectInputStream(fin);
            Student stu2 = (Student) os.readObject();
            System.out.println(stu.name + " " + stu.age + " " + stu.id + " " + stu.address + " " + stu.a + " " + stu.a.m);
            System.out.println(stu2.name + " " + stu2.age + " " + stu2.id + " " + stu2.address + " " + stu2.a  + " " + stu2.a.m);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
