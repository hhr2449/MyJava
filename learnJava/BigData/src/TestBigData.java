import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class TestBigData {
    public static void main(String[] args) {
        System.out.println("请输入一个大整数");
        Scanner sca = new Scanner(System.in);
        //创建一个BigIneger类的对象
        BigInteger a = new BigInteger(sca.next());
        System.out.println("请输入一个整数");
        int n = sca.nextInt();
        //使用valueOf方法创建一个BigInteger类型的对象
        BigInteger b = BigInteger.valueOf(n);
        BigInteger c = a.add(b);
        System.out.println("两个数字的和为：" + c);
        c = a.multiply(b);
        System.out.println("两个数字的乘积为：" + c);
        c = a.divide(b);
        System.out.println("两个数字的商为：" + c);
        c = a.subtract(b);
        System.out.println("两个数字的差为：" + c);
        c = a.mod(b);
        System.out.println("两个数字的余数为：" + c);
        if(a.compareTo(b) == 1) {
            System.out.println("a大于b");
        }
        else if(a.compareTo(b) == -1) {
            System.out.println("a小于b");
        }
        else {
            System.out.println("a等于b");
        }

    }
}
