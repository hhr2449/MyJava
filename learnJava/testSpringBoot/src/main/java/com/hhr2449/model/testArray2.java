package main.java.com.hhr2449.model;

public class testArray2 {
    public static void main(String[] args) {
        // 初始化数组
        String[] a = {"元素1", "元素2", "元素3"};

        // for循环遍历
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        // for-each遍历
        for (String s : a) {
            System.out.println(s);
        }
    }
}