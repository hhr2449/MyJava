package test;
import bank.Bank;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // 测试开户
        bank.addAccount("张三");
        bank.addAccount("李四", 1000);
        bank.addAccount("王五", 5000);
        bank.addAccount("李四", 8000);

        // 测试存取款
        bank.deposit(1, 500);   // 给张三存款500
        bank.withdraw(2, 200);  // 李四取款200

        // 测试修改户主
        bank.modifyName(3, "赵六");

        // 测试转账
        bank.transfer(2, 1, 300); // 李四转给张三300

        // 测试查询
        System.out.println("\n=== 账户1信息 ===");
        System.out.println(bank.getAccountInfo(1));

        System.out.println("\n=== 李四的所有账户 ===");
        bank.getAccountInfo("李四").forEach(System.out::println);
    }
}