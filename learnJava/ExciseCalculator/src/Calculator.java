import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        /*
        快捷键：
        1. ctrl + /  注释，取消注释
        2. ctrl + alt + l  格式化代码(调整缩进等)
        3. ctrl + shift + /  多行注释
        4. ctrl + f  查找
        5. alt + enter 快速生成变量定义
        6. ctrl + shift + enter  自动换行
        7. ctrl + alt + v 提取变量并替换
        8. ctrl + n 查阅文档
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        double p = scanner.nextDouble();
        System.out.println("请输入年利率");
        double yr = scanner.nextDouble();
        double mr = yr / 12.0 / 100;
        System.out.println("请输入还款月数");
        int m = scanner.nextInt();
        //Math.pow()用于计算幂次，pow是Math中的静态方法，可以直接使用类名.方法名()调用
        double pow = Math.pow(1 + mr, m);
        double payment = p * mr * pow / (pow - 1);
        System.out.println("还款金额：" + payment);



    }
}
