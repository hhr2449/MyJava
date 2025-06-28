package com.hhr2449.model;

public class testArray2 {
    public static void main(String[] args) {
        String[] a = new String[]{"hello", "world", "!"};
        //数组长度，注意一旦确定就不能更改
        System.out.println(a.length);
        //for循环遍历
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //for-each遍历
        for(String s : a) {
            System.out.println(s);
        }
        //数组越界会抛出异常
        //System.out.println(a[3]);
        //默认值：null
        String[] b = new String[2];
        System.out.println(b[0]);
        System.out.println(b[1]);

    }
}
