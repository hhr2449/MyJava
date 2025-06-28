package com.hhr2449.model;

public class testArray {
    public static void main(String[] args) {
        String[] a = new String[2];
        a[0] = "Hello";
        a[1] = "World";
        System.out.println(a[0]);
        System.out.println(a[1]);
        String[] b = new String[]{"hello", "world"};
        System.out.println(b[0]);
        System.out.println(b[1]);
        String[] c = {"hello", "world"};
        System.out.println(c[0]);
        System.out.println(c[1]);
    }
}
