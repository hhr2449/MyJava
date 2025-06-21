package com.hhr2449.packageA;
import com.hhr2449.packageB.ClassB2;

public class ClassA1 {
    public ClassA1()
    {
        //如果不导入包，就需要使用全名
        com.hhr2449.packageB.ClassB1 b1 = new com.hhr2449.packageB.ClassB1();
        //导入之后就可以直接使用
        ClassB2 b2 = new ClassB2();
        System.out.println("ClassA1");
    }
    public static void main(String[] args)
    {
        ClassA1 a1 = new ClassA1();
    }
}
