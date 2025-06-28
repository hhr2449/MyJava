## 1.2

下面不属于Java中的位操作符的是：

（1） ~
（2） &
（3） ^
（4） <<
（5） >>
（6） &&
（7） ||
（8） |
（9） >>>

~是非运算符，取反

`>>>`是无符号右移运算符

![image-20250626203516345](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250626203516345.png)

开头为字母，下划线，美元

后面可以用字母，下划线，美元，数字

-不能用



关于数据类型的声明，以下声明正确的是：

（1） byte a = 129

（2） long b = 129F

（3） float c = 1.234F

（4） short d = 1.2

（5） boolean e = true

（6） float f = 1.234D

赋值：小范围赋值给大范围可以自动转换，大范围赋值给小范围会出错（可以由float型数据赋值给double，反过来不可以，即使实际上没有超出范围，float,double型的数据表示范围都比Long大，赋值给long会出错）

不能超出范围


## 1.3

数组静态初始化：定义时就直接指定元素

动态初始化：只指定长度

数组声明时允许String [] s；这样声明，不会给数组元素分配地址

这样声明的数组不能直接使用，必须在后续初始化

注意数组也是对象，必须要使用new int[]这样的语句进行创建

* 关于二维数组的创建，以下做法正确的是：(1)(2)

```java
（1）int a[][] =new int[4][5]
（2）int a[][] =new int[4][]; a[0]=new int[10]; a[1]=new int[20];
（3）int a[][]; a=new int[3][]; a[0]=new int[3]; a[1]={1,2};a[2]={1,2,3};
```

a[1]={1,2}是错误的，a[1]中存放的是一个空引用，必须使用new运算符创建数组对象，在用a[1]对其进行引用

* 关于下面的程序，哪个结论是正确的（）

  ```java
  * public class Test{
        public static void main(String args[]){
            int a[]=new int[5];
            a.length = 10;
            System.out.println(a.length);
        }
    }
  
  
  ```

  注意数组的长度是常量，不能修改，会编译错误
* 对于下列代码

```java
String str1="java";
String str2="java";
String str3 = new String("java");
StringBuffer str4 = new StringBuffer("java");
以下表达式的值为true的是（A）
str1==str2
str1==str4
str2==str3
str3==str4


```

注意==运算符是用于同一类型对象之间的比较的，比较的是引用的地址

String类型和StringBuffer之间比较会直接报错

对于字面量进行赋值的String类型对象，其引用应该指向同一个对象

通过new运算符创建的则会分配到不同的内存，即使内容一致



* ### **不能作为 `switch` 表达式参数的数据类型**

  1. **`long`**

  2. **`float`**

  3. **`double`**

  4. **`boolean`**

  5. 引用类型

     （除String和枚举类型外）

     - 例如：自定义类、数组、`Object` 等。

* ```java
  考查下面的程序代码：
  int num1=40;
  int num2=5;
  int ans=0;
  if(num1/5==num2) {ans=10; }
  if(num2%5==0) {ans=20; }
  if(num2==0) {ans=30; }
  else {ans=40;}
  System.out.println("answer is:" + ans); 下面哪个是程序的输出结果：
  ```

  注意这个不是else if结构，else只和前一个if相关联



## 2.1

oop的核心是数据抽象，过程抽象是为数据抽象服务的

## 2.2

在创建某类的对象时应该：  先声明对象，为对象分配内存空间，再初始化对象，然后才能使用对象

1. 声明：此时定义了对象的引用变量，但是对象本身还没有分配内存
2. 分配内存：调用new ClassName()为对象分配内存
3. 初始化：调用构造函数将对象初始化

## 2.3

```java
import java.io.*;
package mypackage;
public class Rectangle {//doing something...} 
```

注意package应该放在最前面

## 2.4

![image-20250626203534364](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250626203534364.png)

注意这个代码，fun()是类方法，只能够访问类变量，这里访问了m会编译错误



## 2.5

![image-20250626203548175](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250626203548175.png)

如何在构造方法中调用另一个构造方法：
==this(n,a);==

注意不能使用Circle(n,a)或是this.Circle(n,a)

(注意与cpp不同，cpp中是可以直接在初始化列表中调用Circle(n,a)或是使用this->Circle(n,a)的)

## 2.6

```java
关于枚举定义说法正确的是：c
a.定义枚举的关键字是：class
b.枚举中只能有常量
c.枚举是一种特殊的类，因为它的对象的个数是有限的
d.枚举中不能定义抽象方法
//枚举类中可以由成员变量和方法
//枚举类可以有抽象方法，但是在定义枚举常量时要实现
```

## 3.5

```java
Java泛型机制的优点有a,b,c
可以使代码编写变得简单
比较安全
消除对Object类的强制类型转换//编译器可以实现自动类型转换
使得代码运行性能增强
```



