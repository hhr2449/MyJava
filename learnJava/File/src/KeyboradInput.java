import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboradInput {
    public static void main(String[] args) {
        try {
            BufferedReader ib;
            InputStreamReader ir;
            ir = new InputStreamReader(System.in);
            ib = new BufferedReader(ir);
            System.out.println("请输入内容：");
            String line = ib.readLine();
            System.out.println("输入的内容是：" + line);
            int i = Integer.parseInt(line);
            System.out.println("输入的数字是：" + i);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int i = System.in.read();
            System.out.println("输入字符对应的Ascll码：" + i);
            System.out.println("输入的字符是：" + (char)i);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
