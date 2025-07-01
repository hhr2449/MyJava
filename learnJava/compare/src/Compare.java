import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//类本身实现Comparable接口
class People implements Comparable<People>{
    String name;
    int age;
    int salary;
    public People(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
    @Override
    public int compareTo(People p) {
        double rate = (double)salary / age;
        double rate2 = (double)p.salary / p.age;
        //前面小则返回负数
        if(rate < rate2) {
            return -1;
        }
        else if(rate > rate2) {
            return 1;
        }
        else{
            return 0;
        }
    }

}

//实现专门的comparator接口
class PeopleComparator implements Comparator<People> {
    @Override
    public int compare(People p1, People p2) {
        return p1.age - p2.age;
    }
}



public class Compare {
    public static void main(String[] args) {
        People[] p =  new People[4];
        p[0] = new People("Tom", 18, 5000);
        p[1] = new People("Jerry", 20, 6000);
        p[2] = new People("Mike", 19, 7000);
        p[3] = new People("Kate", 18, 8000);
        //直接排序则会使用类本身实现的compareTo方法
        //sort方法是按照定义的比较方法升序排列
        Arrays.sort(p);
        for(People people : p) {
            System.out.println(people.toString());
        }
        System.out.println("--------------------------------");
        PeopleComparator pc = new PeopleComparator();
        //可以指定比较器
        Arrays.sort(p, pc);
        for(People people : p) {
            System.out.println(people.toString());
        }
    }
}
