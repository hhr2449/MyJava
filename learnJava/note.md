## 1.基础

System.out.println("helloworld")
`System.out`, `System.in`都是对象(标准输入输出对象)，`println("")`是对象调用的方法
![image-20250620212609938](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620212609938.png)
`println("")`是将括号内的东西输出并且输出换行，`print("")`则是输出而不换行
方法的圆括号内的东西成为方法参数
对象代表操作的对象，方法代表执行的动作
java是面向对象编程
java源文件中用类来划分代码，可以有多个类，类中可以有多个方法
入口方法：运行一个类时运行的方法称为入口方法，没有入口方法则不能运行

```java
class A {
	public static void main(String[] args) {
		System.out.println("helloworld");
	}
}
```
public static void main(String[] args) {}即为入口方法，称为main方法

代码编译运行流程：
源代码.java  --(编译: javac)-->  字节码文件.class  --(运行: java 虚拟机 JVM)（翻译为机器码）--> 程序执行

![image-20250620213916442](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620213916442.png)

javac编译产生字节码.class文件

![image-20250620213910092](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620213910092.png)

运行对应的字节码文件

![image-20250620214006697](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620214006697.png)

注释：
`//`单行注释
`/* */`多行注释
`/** */`文档注释

字节码的意义：
* c++:直接将源码编译为机器码
 但是不同的平台不能互通，必须重新编译
  ![image-20250620215600126](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620215600126.png)
* java:
加入了字节码作为中间层，只需要编译一次得到字节码，在不同平台有不同的JVM对字节码进行解释，从而得到适应不同平台的机器码
* ![image-20250620215858941](C:\Users\11379\AppData\Roaming\Typora\typora-user-images\image-20250620215858941.png)
* 一次编译，到处运行
* 缺点：需要安装java虚拟机才能运行，运行效率有所降低

IDEA的使用：
项目->模块，模块下面写类
psvm
sout

类名的首字母应该大写，方法名则以小写开头，**源文件名应该与类名相同**

## 2.输入输出

System.out.println("")

System.in.read()

var scanner = new Scanner(System.in)

var line = scanner.nextLine()

```java
import java.util.Scanner;

public class hello {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        var name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hello World");
    }
}

```



## 字符运算

'a':字符值

"abc":字符串值

`\'`    `\\`     `\"`    `\t`   `\d`  ：转义字符

文本块：

```java
"""
窗前"明月"光
疑是地上霜
"""
```

文本块内的内容不会发生转义

字符串可以直接使用+进行拼接

## 数据类型

![image-20250621103140462](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621103140462.png)



## 快捷键

```java
/*
快捷键：
1. ctrl + /  注释，取消注释
2. ctrl + alt + l  格式化代码(调整缩进等)
3. ctrl + shift + /  多行注释
4. ctrl + f  查找
5. alt + enter 快速生成变量定义 对逻辑语句进行改写
6. ctrl + shift + enter  自动换行
7. ctrl + alt + v 提取变量并替换 ctrl + alt + m提取方法并替换
8. ctrl + n 查阅文档
9. ctrl + f12 列出类中的所有方法
*/
```
