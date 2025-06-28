import java.util.Scanner;

public class TestBreakAndSwitch {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sca.nextInt();
        // switch语句
        /*与cpp相同,switch(choice){
            case num1:
                break;
            case num2:
                break;
            default:
                break;

        }
        根据choice的值来决定执行的分支
        */
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
        }
        // break
        //普通的break与c++完全一样，只会跳出当前的循环
        //特殊的是带标签的break语句，执行break label会直接跳出标签所指定的块
        label:
        for (int i = 0; i < 10; i++) {
            System.out.println("第1层循环"+"第"+i+"次执行");
            for (int j = 0; j < 10; j++) {
                System.out.println("第2层循环"+"第"+j+"次执行");
                if(j == 5) {
                    //会直接跳出最外层循环
                    break label;
                }
            }

        }

        // break in if statement
        label:
        if (true) {
            System.out.println("第一个if语句");
            label2:
            if(true) {
                System.out.println("第二个if语句");
                if(true) {
                    System.out.println("第三个if语句");
                    break label;
                }
                if( true) {
                    System.out.println("第四个if语句");
                }
                if( true) {
                    System.out.println("第五个if语句");
                }
            }
            if( true) {
                System.out.println("第六个if语句");
            }
        }

    }
}
