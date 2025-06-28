//package test;
//import bank.Account; // 跨包导入会触发编译错误
//
//public class IllegalAccessTest {
//    public static void main(String[] args) {
//         //尝试直接创建账户（编译错误）
//         Account acc = new Account("黑客");
//
//         //尝试直接操作余额（编译错误）
//         Account acc = bank.getAccount(1);
//         acc.deposit(1000);
//
//        System.out.println("所有非法操作均被编译器阻止！");
//    }
//}