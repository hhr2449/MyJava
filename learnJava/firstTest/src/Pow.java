import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double res = x;
        for(int i = 1; i < n; i++) {
            res*=x;
        }
        System.out.println(res);
    }
}
