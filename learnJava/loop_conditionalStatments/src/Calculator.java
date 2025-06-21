import java.util.Scanner;

class DoubleBox{
    public double value;
    public DoubleBox(double value) {
        this.value = value;
    }
}

public class Calculator {
    //写条件语句的技巧：
    //采用过滤错误的方法啊，将可能错误的情况进行if语句判断
    //如果有错误，则return或者抛出错误
    //避免过多的if语句嵌套

    /*
    java中的参数对于基本类型只能传递值，不能传递引用
    数组，对象则传递的是引用
    java中没有指针
    想要让基本数据类型获得类似引用传递的效果，可以使用包装类或是使用数组
     */
    public static void main(String[] args) {
        double[] p = {10};
        inputP(p);

        DoubleBox yr = new DoubleBox(10);
        getYr(yr);

        Scanner scanner = new Scanner(System.in);
        int m = inputM();
        double payment = calculatPayment(p[0], yr.value, m);
        printPaymentMothly(m, payment, p[0], yr.value);

    }

    //这里只是作为展示使用三种输入方法，正式编程时推荐使用返回值的方式
    /**使用包装类来实现类似引用传递
     * 获取年利率
     * @param yr 年利率
     */
    private static void getYr(DoubleBox yr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年利率");
        yr.value = scanner.nextDouble();
        if (yr.value < 0 || yr.value > 1) {
            throw new RuntimeException("年利率不能够小于0或者大于1");
        }
    }

    /**使用数组来实现类似引用传递
     * 获取本金
     * @param p 代表本金
     */
    public static void inputP(double[] p) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        p[0] = scanner.nextDouble();
        if (p[0] < 0) {
            throw new RuntimeException("本金不能够小于0");
        }
    }

    /**使用返回值
     * 获取月数
     * @return 返回月数
     */
    public static int inputM() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月数");
        int m = scanner.nextInt();
        if (m < 0) {
            throw new RuntimeException("月数不能够小于0");
        }
        return m;
    }

    /**
     * 打印每月的还款金额和剩余本金
     * @param m 月数
     * @param payment 月供
     * @param p 本金
     * @param yr 年利率
     */
    private static void printPaymentMothly(int m, double payment, double p, double yr) {
        for (int i = 1; i <= m; i++) {
            System.out.println("第" + i + "月供为：" + payment);
            System.out.println("偿还利息" + p * yr + "元\t" + "偿还本金" + (payment - p * yr));
            p = p - payment + p * yr;
            if(p < 0.001) {
                p = 0;
            }
            System.out.println("还剩本金" + p);
            if(p == 0) {
                System.out.println("恭喜你还清贷款");
            }
        }
    }

    /**
     * 使用等额本息的方法来计算每月的还款金额
     * @param p 代表本金
     * @param yr 代表年利率
     * @param m 代表还款月数
     * @return 返回每月应该还款的金额
     */
    private static double calculatPayment(double p, double yr, int m) {

        double payment = p * yr * Math.pow(1 + yr, m) / (Math.pow(1 + yr, m) - 1);
        System.out.println("月供为：" + payment);
        return payment;
    }
    //测试使用方法来重构利率计算器
    //使用方法可以隐藏实现的细节，同时可以减少重复的代码
}
