package bank;
/*
设计思路：
设计账户类，里面包含户主，账号，余额信息
设计银行类，里面维护了账户列表
可以实现的操作：银行应该能够创建账户，存取款，修改户主，查询信息，转账
权限控制：账户类中的信息应该全为私有的，并且账号不能够修改
账户类中不能直接修改余额，应该通过存取款修改
创建账户，获取账户信息，存取款等操作应该只有银行类能够使用
所以账户类中的构造方法，getter方法，setter方法都应该设置为包内私有，只有同包内的银行类可以访问
银行中的存取款等方法则是对外开放的，应为公有
*/


import java.util.ArrayList;
import java.util.List;

//账户类，封装了账户信息，同时能够获取账户信息
class Account {
    //户主，账号，余额
    //账号按照顺序来分配
    private static int LAST_ACCOUNT_NUM = 0;
    private String ownName;
    private final int accountNum;
    private double balance;
    //构造账户：人为设置户主和初始存入的钱，账号自动分配
    private Account(String name , int num, double balance) {
        this.ownName = name;
        this.accountNum = num;
        this.balance = balance;
    }
    //这里调用了上面的构造函数
    //均设置为包级私有的权限，只允许同包内的类访问
    //1.只设置户主，不存钱
    Account (String name) {
        this(name,LAST_ACCOUNT_NUM + 1, 0);
        LAST_ACCOUNT_NUM++;
    }
    //2.设置户主，存钱
    Account (String name, double initBalance) {
        this(name,LAST_ACCOUNT_NUM + 1, initBalance);
        LAST_ACCOUNT_NUM++;
    }
    //接下来写getter方法和setter方法
    String getOwnName() {
        return ownName;
    }
    int getAccountNum() {
        return accountNum;
    }
    double getBalance() {
        return balance;
    }
    //现实情况中，账户的余额不应该修改，而应该使用存款和取款方法间接修改，同时账号应该保持不变
    void setOwnName(String name) {
        this.ownName = name;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        balance -= amount;
    }
    String getInfo() {
        return "账号" + accountNum + "，户主：" + ownName + "，余额：" + balance;
    }
}

//将银行类设置为公有的，允许其他类访问，向外提供服务，而Account只是辅助类，不对外提供服务
public class Bank {
    //账户列表，注意是私有的
    private List<Account> accounts = new ArrayList<>();
    //获取账户信息
    //根据账号获取账户信息
    public String getAccountInfo(int accountNum) {
        for(Account a: accounts) {
            if(a.getAccountNum() == accountNum) {
                return a.getInfo();
            }
        }
        return "没有此账号";
    }
    //获取某个户主的所有账户信息
    public List<String> getAccountInfo(String name) {
        List<String> res = new ArrayList<>();
        for(Account a: accounts) {
            if(a.getOwnName().equals(name)) {
                res.add(a.getInfo());
            }
        }
        return res;
    }

    //获取账户
    //工具方法，设为私有
    private Account getAccount(int accountNum) {
        for(Account a: accounts) {
            if(a.getAccountNum() == accountNum) {
                return a;
            }
        }
        return null;
    }
    //创建账户
    public void addAccount (String name) {
        accounts.add(new Account(name));
        Account a = accounts.get(accounts.size()-1);
        System.out.println("创建成功," + a.getInfo());
    }
    public void addAccount (String name, double initBalance) {
        accounts.add(new Account(name, initBalance));
        Account a = accounts.get(accounts.size()-1);
        System.out.println("创建成功," + a.getInfo());
    }
    //存取款
    public void deposit(int accountNum, double amount) {
        Account a = getAccount(accountNum);
        a.deposit(amount);
        System.out.println("存款成功，" + a.getInfo());
    }
    public void withdraw(int accountNum, double amount) {
        Account a = getAccount(accountNum);
        a.withdraw(amount);
        System.out.println("取款成功，" + a.getInfo());
    }
    //修改户主
    public void modifyName(int accountNum, String name) {
        Account a = getAccount(accountNum);
        a.setOwnName(name);
        System.out.println("修改成功，账户:)"+ accountNum + "当前户主为：" + name);
    }
    //转账
    public void transfer(int fromAccountNum, int toAccountNum, double amount) {
        Account from = getAccount(fromAccountNum);
        Account to = getAccount(toAccountNum);
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("转账成功，账户" + fromAccountNum + "余额为：" + from.getBalance() + "账户" + toAccountNum + "余额为：" + to.getBalance());
    }


}

