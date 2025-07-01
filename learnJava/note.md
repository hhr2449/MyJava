

## 基础



java计算平台：

1. java SE:java standard edition(基础平台)
2. java EE:java enterprise edition（企业版）
3. java ME:java micro edition（微型版）

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

可以通过javadoc命令来生成代码文档

字节码的意义：

* c++:直接将源码编译为机器码
 但是不同的平台不能互通，必须重新编译
  ![image-20250620215600126](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250620215600126.png)
* java:
加入了字节码作为中间层，只需要编译一次得到字节码，在不同平台有不同的JVM对字节码进行解释，从而得到适应不同平台的机器码
* ![image-20250620215858941](C:\Users\11379\AppData\Roaming\Typora\typora-user-images\image-20250620215858941.png)
* ![image-20250623104328145](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250623104328145.png)
* ![image-20250623104300366](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250623104300366.png)
* 一次编译，到处运行
* 缺点：需要安装java虚拟机才能运行，运行效率有所降低

IDEA的使用：
项目->模块，模块下面写类
psvm
sout



源文件中可以有多个类，但是只能有一个public类（可以没有）

类名的首字母应该大写，方法名则以小写开头，**源文件名应该与public类类名相同**

```java
package
import
import
public class
class
class
interface
```

编码规范：

![image-20250623112211208](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250623112211208.png)

## 输入输出

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



读取文件：

```java
Scanner fileIn = null;
        try {
            String path;
            //注意路径中的\需要转义
            path = "D:\\MyJava\\learnJava\\intAndOut\\test.txt";
            fileIn = new Scanner(Paths.get(path), "UTF-8");
            //创建成功后就可以正常使用Scanner对象来读取文件，与控制台输入一样
            String str = fileIn.nextLine();
            System.out.println(str);
        }
        catch(Exception e) {
            System.out.println("文件打开失败");
        }
        finally {
            if(fileIn != null) {
                fileIn.close();
            }
        }
```

使用`Scanner fileIn = new Scanner(Paths.get(filename), "UTF-8");`来创建一个用于读取文件的Scanner类对象

`Paths.get()`是`java.nio.file.path`类中的一个方法，用于将路径字符串转换为一个Path类的对象

```java
 PrintWriter fileOut = null;
        try {
            fileOut = new PrintWriter("D:\\MyJava\\learnJava\\intAndOut\\test.txt", "UTF-8");
            fileOut.println("Hello World");
        }
        catch(Exception e) {
            System.out.println("文件打开失败");
        }
        finally {
            if(fileOut != null) {
                fileOut.close();
            }
        }
```



文件输出操作：

创建PrintWriter类的对象，此时只需要指定路径的字符串即可

与控制台输出类似，可以使用println,print,printf来进行文件输出

注意输入输出完成后要使用close()函数来进行关闭操作

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
10. 在方法前输入/**再回车，可以进行文档注释
*/
```



## java中的参数

```java
java中的参数对于基本类型只能传递值，不能传递引用
数组（也是一个对象），对象则传递的是引用的值（创建对象时本身获得的就是一个引用）
//实质上是引用的值传递
java中没有指针
想要让基本数据类型获得类似引用传递的效果，可以使用包装类或是使用数组
    void motify(int[] a) {
	a = 100;
}
    int[] a = {10};
motify(a)
    
    
    
    class IntBox {
        int value;
        IntBox(int v) {
            this.value = v;
        }
    }
IntBox a = new IntBox(10);

```

java中的引用传递和cpp中并不完全一样

```cpp
 #include <iostream>
 using namespace std;
 class A{
    int value;
 public:
     A(int value) : value(value) {}
     int getValue() { return value; }
 };

 void swap(A& x, A& y) {
    A temp = x;
    x = y;
    y = temp;
 }

 int main() {
     A a(10);
     A b(20);
     cout << "a: " << a.getValue() << endl;
     cout << "b: " << b.getValue() << endl;
     //a:10
     //b:20
     swap(a, b);
     cout << "a: " << a.getValue() << endl;
     cout << "b: " << b.getValue() << endl;
     //a:20
     //b:10
     return 0;
 }
```



cpp中的引用的x,y操控的是传入的a,b,在函数里面对x,y的改变会影响到a,b



```java
public class Employee {
    int value;
    Employee(int value) {
        this.value = value;
    }
    void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;

    }
    public static void main(String[] args) {
        Employee e1 = new Employee(10);
        Employee e2 = new Employee(20);
        System.out.println("Before Swapping");
        System.out.println("e1: " + e1.value);
        System.out.println("e2: " + e2.value);
        //Before Swapping
		//e1: 10
		//e2: 20
        e1.swap(e1, e2);
        System.out.println("After Swapping");
        System.out.println("e1: " + e1.value);
        System.out.println("e2: " + e2.value);
        //After Swapping
		//e1: 10
		//e2: 20
    }
}
```

java中的引用相当于形参x,y和实参引用了同一个对象，但是x,y本身的改变不会影响到e1,e2

相当于实参是引用，形参是实参的副本，引用的值传递

Java 中只有一种参数传递方式：**值传递**。

- 如果传的是对象，那么传的是对象引用的值（地址）；
- 传进去的是引用的拷贝，**修改引用本身不会影响实参，但可以通过引用修改对象的内部内容**。
- ![image-20250623104949702](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250623104949702.png)



## 标签

使用标签来标记一个块作用域，当执行break label时会直接跳出label标记的块作用域

```java
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
```



```java
// break in if statement
        label:
        if (true) {
            System.out.println("第一个if语句");
            label2:
            if(true) {
                System.out.println("第二个if语句");
                if(true) {
                    System.out.println("第三个if语句");
                    //此时只会跳出第二层if，会去执行第六个if
                    break label2;
                }
                if(true) {
                    System.out.println("第四个if语句");
                }
                if(true) {
                    System.out.println("第五个if语句");
                }
            }
            if(true) {
                System.out.println("第六个if语句");
            }
        }

    }
```

```java
// break in if statement
        label:
        if (true) {
            System.out.println("第一个if语句");
            label2:
            if(true) {
                System.out.println("第二个if语句");
                if(true) {
                    System.out.println("第三个if语句");
                    //直接跳出最外层if
                    break label;
                }
                if(true) {
                    System.out.println("第四个if语句");
                }
                if(true) {
                    System.out.println("第五个if语句");
                }
            }
            if(true) {
                System.out.println("第六个if语句");
            }
        }

    }
```



## c++和java中的作用域差异

c++中嵌套的作用域是可以重复定义同一个变量的，并且内外层互不干扰，也就是内层定义的变量的任何操作都不会影响到外层的同名变量（相当于内外层定义的两个变量只是名字相同）

```cpp
{
        int a = 10;
        {
            int a = 20;
            cout << a << '\n';
            // a = 20
            a = 100;
        }
        cout << a << '\n';
    	// a = 10
     }
```

```cpp
{
        int a = 10;
        {
            cout << a << '\n';
            a = 100;
        }
        cout << a << '\n';
     }
```

如果内层没有重新定义而是沿用外层的同一个变量，那么内层的改变会影响到外层

但是java中不允许内层和外层定义同一个变量的

```java
public static void main(String[] args) {
        {
            int a = 10;
            {
                int a = 20;
                //这里报错
            }
        }
    }
```

## 大数运算

```java
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class TestBigData {
    public static void main(String[] args) {
        System.out.println("请输入一个大整数");
        Scanner sca = new Scanner(System.in);
        //创建一个BigIneger类的对象
        BigInteger a = new BigInteger(sca.next());
        System.out.println("请输入一个整数");
        int n = sca.nextInt();
        //使用valueOf方法创建一个BigInteger类型的对象
        BigInteger b = BigInteger.valueOf(n);
        BigInteger c = a.add(b);
        System.out.println("两个数字的和为：" + c);
        c = a.multiply(b);
        System.out.println("两个数字的乘积为：" + c);
        c = a.divide(b);
        System.out.println("两个数字的商为：" + c);
        c = a.subtract(b);
        System.out.println("两个数字的差为：" + c);
        c = a.mod(b);
        System.out.println("两个数字的余数为：" + c);
        if(a.compareTo(b) == 1) {
            System.out.println("a大于b");
        }
        else if(a.compareTo(b) == -1) {
            System.out.println("a小于b");
        }
        else {
            System.out.println("a等于b");
        }

    }
}
```

使用BigInteger类和Decimal类可以实现任意大小的整数和浮点数运算

注意运算操作的API

## java中的数组

| 特性       | c++                                       | java                                                   |
| ---------- | ----------------------------------------- | ------------------------------------------------------ |
| 数组的本质 | 一块连续的内存                            | 一个对象                                               |
| 数组名     | 指向数组首元素地址的指针常量              | 对于数组对象的引用（所以java中不支持对数组名进行运算） |
| 内存管理   | 手动管理，支持栈上/堆上分配               | 自动管理，由 JVM 自动垃圾回收                          |
| 访问       | [index]实质上式指针的偏移，越界访问不安全 | []是一种对象访问操作，会进行边界检查，越界会抛出异常   |

定义方式：

1. 类型[ ]  变量名 = new 类型[长度]

2. 类型[ ]  变量名 = new 类型[ ]{元素1，元素2，元素3}

3. 类型[ ]  变量名 = {元素1， 元素2，元素3}

4. ```java
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
   ```





多维数组：

由于java中的数组的实质是一个对象，所以二维数组就相当于数组的数组，数组中的每一个单元都引用了一个数组

1. Java中可以很方便的创建不规则数组
2. Java中可以单独把子数组给引用出来，也可以实现两个子数组之间的交换

for each循环

格式for(var : collection) {

​	statement

}

代表将collection中的每一个元素的取出来一遍，叫做var

如果使用for each循环来遍历二维数组

要注意每次取出来的都是一个数组对象，所以应该嵌套两个

for(var1 : collection) {

​	for(var2 : var1) {

}



}



==注意for循环数组下标访问和for-each循环不完全一样==

```java
int [] b = a;
//在for-each循环中取出的i是b[i]的副本值，不会对数组a,b产生影响
for(int i : b) {
    i++;
}
for(int i : a) {
    System.out.print(i + " ");
}
//for循环中b[i]则是引用，对数组a,b产生影响
for(int i = 0; i < b.length; i++) {
    b[i]++;
}
for(int i : a) {
    System.out.print(i + " ");
}
```



使用多维数组

```java
//创建一个5行的二维数组
//实质上是数组的数组，也就是一个一维的数组对象，里面的元素也是一个数组对象
int [][] c = new int[5][];
//对于数组的每一行，长度可以不同，可以单独对每一行进行赋值
//可以单独取用每一行，也可以交换两行（因为每一行的实质是一个数组对象，所以操作起来更灵活）
c[0] = new int[]{1};
c[1] = new int[]{1,2};
c[2] = new int[]{1,2,3};
c[3] = new int[]{1,2,3,4};
c[4] = a;

for(int i = 0; i < c.length; i++) {
    for(int j = 0; j < c[i].length; j++) {
        System.out.print(c[i][j] + " ");
    }
    System.out.print("\n");
}

//使用for-each循环遍历二维数组
//注意外层的元素是int[]类型
for(int[] i : c) {
    for(int j : i) {
        System.out.print(j + " ");
    }
    System.out.print("\n");
}
```

## java中的对象的一个小要点

**java中所有对象的实例都是用引用来表示的**

在c++中，表示一个类有三种方式：

1. A a;  这里的a表示的是对象本身
2. A &ref = a;这里的ref表示对象的引用
3. A* p = &a;这里的p表示指向对象的指针

c++支持对象本身，指针，引用三种表示方式，对三种方式进行赋值运算：

1. A b = a;会发生拷贝，b和a是两个不同的对象
2. A& ref2 = ref; ref2是原对象的另一个别名
3. A* p2 = p; p2同样是指向原本对象的指针



但是在java中，只有基本数据类型才会储存值本身，所有的实例化对象都只能持有它的引用

类都创建在堆上，创建类一定要使用new运算符，不能直接A a();

A a = new A();   a是一个引用，持有对象的地址，可以正常取用，但是不能像指针一样进行运算

A b = a;   发生的也只是引用的赋值，也就是b是a指向的对象的另一个引用，不会发生值得传递

java的引用可以进行赋值，与cpp不同

可以将引用设为null，表示没有引用任何对象

## packge

用于管理生成的字节码文件，对应文件系统中的目录，会将编译生成的.class文件放入对应的目录

作用：用于更好的组织类

1. 将功能相近的类或接口放在同一个包下，方便管理和查找
2. 包采取树形的储存形式，不同的包中文件名可以相同，可以减少命名冲突
3. 包还限制了访问权限

包的语法：

在文件的前方加上 package pkg1.pkg2.pkg3……

pkg1.pkg2.pkg3……代表该文件在包结构中的存储位置

比如Something.java为：

package net.java.util

public class Something{

}

那么其储存的路径应该是

net/java/util/Something.java

包的命名：一般是域名倒置

比如网站为www.hhr2449.com

那么储存包时最根部的包应该是com.hhr2449

引入包：

采用import

import package1[.package2…].(classname|*);



## 打包

如何发布编写完成的程序

对编译好的.class文件进行打包

项目==》项目结构--》工件--》添加jar包--》从具有依赖项的模块--》选择模块--》选择主类并确定

构建--》构建工件

在out/artifact即可找到压缩包.jar

运行代码：前提是安装了jdk，此时在终端中打开jar包的地址，运行 `java -jar package.jar`

即可



## 内存回收

无用对象：

1. 离开作用域的对象
2. 没有引用指向的对象

java运行时会通过垃圾收集器周期性的释放无用对象的内存

每一个类中都有一个finalize方法，系统会在对对象进行垃圾回收的前一刻自动调用对象的sinalize方法

该方法可以被重写，用于释放资源，但是注意这个方法的调用没有次序，所以finalize中的释放操作不能有次序性

垃圾收集器：自动扫描对象的动态内存区，对不在使用的对象进行标记进行回收

其作为一个后台进程运行，通常在系统空闲时异步执行



## 枚举类

![image-20250626205321856](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250626205321856.png)

枚举类实际上就是一个类，隐含继承于Enum类

枚举类的类体可以包括方法和变量

枚举值实际上时静态常量实例，比如：

```java
enum Color { RED, GREEN, BLUE }
相当于：
class Color extends Enum<color>{
    public static final Color RED = new Color("RED",0);
    public static final Color GREEN = new Color("GREEN", 1);
    public static final Color BLUE = new Color("BLUE", 2);
}
```

枚举类可以定义构造方法，但是构造方法必须是私有或包内私有的，创建枚举常量时会自动调用构造方法，不允许显示调用构造方法（构造方法只在构造枚举常量时使用）

示例：

```java
enum Color{
    //枚举常量就是static final类型的对象
    //在创建枚举常量的时候可以调用构造方法，也可以重写抽象方法
    //枚举常量之间以逗号分割，最后加分号
    RED("red", 1) {
        @Override
        public String getDescription() {
            return "This is a red color";
        }
    },
    GREEN("green", 2) {
        @Override
        public String getDescription() {
            return "This is a green color";
        }
    },
    BLUE("blue", 3) {
        @Override
        public String getDescription() {
            return "This is a blue color";
        }
    };


    //枚举类中可以设置成员变量
    private String name;
    private int value;
    //枚举类中可以设置构造方法，但是一定要是私有的，在创建枚举常量的时候可以调用构造方法
    private Color(String name, int value) {
        this.name = name;
        this.value = value;
    }
    //可以定义普通方法
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    //可以定义抽象方法，但是在定义枚举常量的时候必须实现该方法
    public abstract String getDescription();
    //可以定义静态方法
    public static Color getColor(int value) {
        for(Color c:values()) {
            if(c.getValue() == value) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid value");
    }
    @Override
    public String toString() {
        return "Color" + name + "(" + value + ")";
    }

}

public class TestEnum {
    public static void main(String[] args) {
        //因为是静态对象，所以可以直接用类名来获取枚举对象（枚举类一般不会单独定义新的对象）
        Color red = Color.RED;
        System.out.println(red);
        System.out.println(red.getName());
        System.out.println(red.getValue());
        System.out.println(red.getDescription());
        //values()是枚举类的静态方法，返回枚举对象的数组
        for(Color c:Color.values()) {
            System.out.println(c);
        }
        System.out.println(Color.getColor(1));
        
    }
}
```

## 开发web程序

1. CS架构

   ![image-20250621201531221](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621201531221.png)

可以有多个客户端，客户端会发送请求，通过网络将请求发送到服务器，服务器会处理请求，将结果返回给客户端，称为响应

一个程序可以被多个客户端使用，称为CS架构(client/service)

![image-20250621202116903](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621202116903.png)

可以使用浏览器作为客户端，使用SpringBoot技术作为服务器



请求和响应的格式：
统一资源定位符：URL(Uniform Resource Locator)

起到定位和传参的功能

格式`协议://主机[:端口][/路径][?查询参数]`

`http://localhost:8080/add?a=1&b=5`

http:网络协议

loclahost"主机，自己的电脑

8080:端口，同一个服务器可能有多个程序在运行，端口可以用于区分请求时发给那个程序的

add:路径，代表要使用程序中的哪个功能，比如/add可能代表用户请求使用加法功能

?a=1&b=5:代表使用该功能需要的参数，比如这里代表加法运算的两个参数是a=1和b=5



## SpringBoot

处理请求和响应的框架

框架：

1. 规定了一定的编码规则
2. 提供了很多通用功能，能够节省开发时间
3. 核心类库提供的功能更加通用，框架则是针对一个具体的问题

创建SpringBoot

使用[Spring Initializr](https://start.spring.io/)

![image-20250621210745766](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621210745766.png)

或是使用阿里云

![image-20250621211123506](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621211123506.png)

如果使用阿里云的话要修改xml文件

1. java的版本改为17
2. SpringBoot版本改为2.7.0

maven:用于下载和管理第三方jar包

SpringBoot继承了maven，但是默认的下载地址是国外的，要进行修改

![image-20250621211810643](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621211810643.png)

修改配置文件

![image-20250621212537262](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250621212537262.png)

将解压出来的SpringBoot文件夹粘贴到idea中

在项目结构中导入模块，选择pom.xml文件即可

或者是直接右键pom.xml，添加为maven项目即可









## lesson2 基础知识

![image-20250625113119167](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625113119167.png)

![image-20250625090927046](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625090927046.png)

$1000D可以定义

0123是八进制，0x123是16进制，123.4f表示float(默认表示为double)

32位整型int范围：-$2^{31}$~$2^{31}$-1

`"/""`使用转义字符来打印双引号

![](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625091901580.png)

5/2=2，是整型之间的运算

"3abc"

"5abc"

"3abc2"

3+"abc"+"2"="3abc2"

**+运算中存在一个字符串，则java会执行字符串拼接而不是数值加法**

无指针，有引用

浮点数的最大值



### 标识符

1. 可以以字母，下划线，美元符开头

2. 后面可以跟字母，下划线，数字，美元

3. 不能保留字重复

![image-20250625092606780](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625092606780.png)

{const,goto}在java中是保留字，但是不被使用

catch:用于捕获异常

final:用来定义常量，修饰一个方法则不能被改写

finally:捕获异常中try-catch-finally

native:在java中调用其他语言编写的程序

package:打包,把编译好的.class文件放到指定的文件夹中，用于管理程序

synchoeonized:线程控制时同步

throw:抛出异常

throws:声明抛出异常

transient:



### 数据类型

![image-20250625093231066](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625093231066.png)

* char是16位unicode

* boolean也是16位，只有true，false两种，不能自动转换为int

* double64位，float32位

* byte:8位，short:16位，int:32位，long:64位

* 一个对象的引用是32位

class:类

interface:接口

**注意**：String不是内置基本类型，而是一个类

### 定义与表示

* 常量定义:final int NUM=100;

用final定义常量，常量全大写

* 变量定义：

int count;

* boolean只有两个值：true,false，且他们不对应任何整数值

* char:占16位，范围为0~65535，用单引号引起来

char c = 'a'

* 转义字符，以\开始

  ![image-20250625094016053](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625094016053.png)

![image-20250625094415072](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625094415072.png)

* 整型常量：![image-20250625094922702](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625094922702.png)

八进制：0开头   16进制：0x或0X开头

* 整型变量表示范围：
  ![image-20250625095239185](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625095239185.png)

8位，16位，32位，64位

* 浮点数表示：

![image-20250625095428228](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625095428228.png)

`123.`是一个double型相当于123.0，123是一个int型，.123相当于0.123

* 浮点数表示范围：

  

  ![image-20250625095539382](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625095539382.png)

  32位浮点型表示的范围比64位整型表示的范围还大

* 自动类型转换：

  ![image-20250625095612109](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625095612109.png)

从表示范围小的转换到表示范围大的，从而保证转换的安全性

### 简单数据类型的封装类

简单数据类型不是类，但是可以使用其封装类

![image-20250625100603582](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625100603582.png)

![image-20250625100636361](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625100636361.png)

封装类里面的静态成员常量

```java
//输出浮点数的最大值
System.out.println(Float.MAX_VALUE);
//输出0/0
System.out.println(Float.NaN);
```

#### 自动装箱和自动拆箱

* valueOf()方法（可以实现基本类到封装类的转换）：有三个重载，其中常见的有两个，以Integer为例：

​		有valueOf(int value)和valueOf(String value)方法，可以实现基本类型和字符串到封装类的转换

* intValue()方法（可以实现封装类到基本类的转换）

自动装箱：Integer a = 100;实现自动装箱，编译器会自动将100转换为Integer对象

自动拆箱：int b = a;实现自动拆箱，编译器会自动将a转换为基本类型

```java
Integer a = 100;
System.out.println(a);
int b = a;
System.out.println(b);
```

注意包装类对象是可以直接打印输出的，输出的就是对应的基本类型

### 运算符

![image-20250625101330973](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625101330973.png)

![image-20250625101449271](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625101449271.png)

instanceof()用于判断该对象是否属于某类

```java
if(a instanceof A) {
    System.out.println("a是A的实例");
}
```

![image-20250625102432162](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625102432162.png)

`&&`前面如果是false，则不继续判断

`||`前面如果是true，则不继续判断

![image-20250625103356811](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625103356811.png)

"12abc"

字符串之后的都按照字符串拼接

如果前面的不是字符串，则先运算，再拼接



![image-20250625104322620](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625104322620.png)

复合数据类型的比较要看引用

比较内容要使用equals函数



### 引用的概念

![image-20250625104707413](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625104707413.png)

new Date()创建出一个对象d占用的内存空间

然后Date d = 再将内存空间的地址填入引用d

### 数组

数组是最简单的复合数据类型，数据是有序数据的集合

定义：type[] arrayName = new type();   里面的元素是type类型的

![image-20250625110322150](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625110322150.png)

数组名是一个**引用**，指向的空间中存放具体的数据

![image-20250625110714860](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625110714860.png)

数组名是引用，指向的空间放的也是引用，指向具体的对象

![image-20250625110824052](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625110824052.png)

数组的数组，相当于一位数组里面放指向数组的引用，不要求内存连续分配，所以不要求数组的大小规则



### String类

![image-20250625111713716](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625111713716.png)

String表示的是不变字符串，所以不能直接对String类对象的内容进行修改，而是通过生成新的字符串的方式修改
（注意与cpp不同，cpp的字符串是一个字符数组，java的字符串是一个不变的对象）



字符串比较：
`==`比较两个引用引用的对象是否一致

`equals`比较字符串的内容

==object类中的equals方法是比较引用地址的，String类中将其进行了重写==

`equalsIgnoreCase`忽略大小写比较

object类里面有toStirng()方法，可以将任何数据转换为字符串

![image-20250625112646700](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625112646700.png)

## lesson3 面向对象编程

![image-20250625192055047](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625192055047.png)

![image-20250625134056981](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625134056981.png)

* 面向对象特性：封装、继承、多态
  Java中一个类只能有一个父类

* 能否在一个类中定义另一个类

  java中允许在类的内部定义另一个类(内部类InnerClass)

* 如何让不同的类拥有相同的方法

  继承、接口
  
* 如何约定一些方法的调用形式但是实现不同

  重载（overload）、重写(override)
  
  ![image-20250625134707450](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625134707450.png) 



### 消息

![image-20250625140249826](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625140249826.png)

PrintStream类提供了println方法

System类中定义静态对象：static PrintStream out

可以直接通过类名来调用静态成员对象:System.out

然后out在调用PrintStream类中的方法System.out.println()

向对象System.out发送服务请求（对象表示），请求的服务是println（服务表示），输入信息为"hello"（输入信息），回答信息为返回值（回答信息）（返回值为void，没有）

### 主动对象

主动对象是一组属性和服务的封装体，其中至少有一个服务不需要接受消息就能主动执行(主动服务)

拥有main方法的对象是主动对象

源程序---->可执行程序---->可执行程序执行----->进程

### 类声明

![image-20250625141324962](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625141324962.png)

* 类的访问权限：只有有无public两种，public类能够被所有类访问，默认类只能被同一个包内的类访问，用于控制类是否暴露在外。在大型项目中，一个包内可能有多个类（一个包是为了一个功能而服务的，只需要把使用该功能的API开放即可，实现的过程可以封装在包内），但是其中有一些类是工具类，帮助类，这些是不需要对外暴露的，只需要把核心类和接口设置为public就可以了

* abstract:用于控制是否为抽象类，抽象类包含抽象方法，不能够实例化，一般用于继承，用于定义公共的行为或模板（有共同的逻辑结构，但是具体的实现不同）

* final:表示这个类不能被继承

* extends:用于继承，后面的是父类

* implements:表示实现的接口

* 接口vs继承：继承表示is-a关系，表示事物的本质，接口表示can-do关系，表示一种规范的行为，接口偏重描述行为，更加灵活。一般用一个主要基类来描述对象本质，再实现若干接口来辅助描述对象的行为。相比于多继承，这样的设计更灵活，并且降低了复杂度

  

### Java.lang.Object

最顶层的类

该类定义了一些所有对象最基本的状态

![image-20250625141654836](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625141654836.png)

```java
Cat c1 = new Cat();
Cat c2 = new Cat();
System.out.println(c1.hashCode());
System.out.println(c2.hashCode());
System.out.println(c1.toString());
System.out.println(c2.toString());
System.out.println(c1.equals(c2));
System.out.println(c1.getClass());
System.out.println(c2.getClass());
```

![image-20250625143316157](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625143316157.png)

### 类定义

![image-20250625143708321](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625143708321.png)

包含成员变量和成员方法

成员变量

![image-20250625143423120](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625143423120.png)

static:表示一个变量是静态的，该变量属于一个类而不属于某个对象，可以直接使用ClassName.variableName来调用这个变量，同时任何一个对象对这个变量的操作都会直接反应到这个变量

final：表示这个变量是常量

成员方法

![image-20250625143725200](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625143725200.png)

static:表示这个方法是类方法，可以直接使用ClassName.methodName()来调用

abstract:表示为抽象方法，没有实现，有抽象方法的类是抽象类，要求在继承中具体实现

throws:用于声明可能会出现的异常

### 方法中的值参传递

java中只有值传递，没有引用传递，将对象作为参数，则传递的是对象的引用，在函数内对对象的改变会影响到原本的对象（但是不是引用传递，实质上还是值传递）

```java
public class Parameter {
    int value = 0;
    static void addInt(int a) {
        a++;
    }
    static void addP(Parameter p) {
        p.value++;
    }
    public static void main(String[] args) {
        Parameter p = new Parameter();
        //p.value = 0
        addInt(p.value);
        //p.value = 0
        System.out.println(p.value);
        addP(p);
        //p.value = 1
        System.out.println(p.value);
    }
}
```

### 方法体

方法体包含局部变量的定义和所有合法的java语句

方法内定义的局部变量作用域在方法内部

可以定义和成员变量同名的局部变量，此时定义的局部变量会隐藏成员变量，对该变量的操作不会影响到成员变量

this用于在方法中引用当前调用方法的对象

```java
    class Variable {
    int x = 0,y = 0,z = 0;
    void init() {
        this.x = 20;
        this.y = 30;
        //注意这里的z是定义的局部变量，而不是成员变量中的z,所以这里对z的改变不会影响到原本的对象
        int z = 5;
        System.out.println("x=" + x + ",y=" + y + ",z=" + z);
    }
}
public class VariableTest {
    public static void main(String[] args) {
        Variable v = new Variable();
        System.out.println("x=" + v.x + ",y=" + v.y + ",z=" + v.z);
        v.init();
        System.out.println("x=" + v.x + ",y=" + v.y + ",z=" + v.z);
    }
}
```

![image-20250625152713695](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625152713695.png)

### 重载

![image-20250625145142743](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625145142743.png)

### 构造方法

与类名相同，没有返回值

构造方法由new运算符调用

使用构造方法进行初始化

```java
public class Constructor {
    int x, y;
    Constructor(int x,int y) {
        this.x = x;
        this.y = y;
        System.out.println(this.toString() + "构造方法1调用");
    }
    Constructor(int x) {
        this.x = x;
        this.y = y;
        System.out.println(this.toString() + "构造方法2调用");
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(10, 20);
        Constructor c2 = new Constructor(30);
    }
}
```



### 对象

类实例化创建对象

对象通过信息传递来进行交互

表现为调用对象的某个方法

* 对象的创建

  type objectName = new type()

  type objectName是对象的声明，不为对象分配具体的内存，只为对象的引用分配内存

  new type()调用构造函数，并且为对象分配具体的内存，并且返回对象的引用

  new type()可以创建一个匿名对象，此时对象已经分配了内存，但是没有引用指向它

![image-20250625150417848](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625150417848.png)

![image-20250625150612464](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625150612464.png)

### 类特性



#### 封装性：类定义

类的访问权限：

* public可以被不同包访问
* defult是只能被同一个包的类访问

访问权限：

![image-20250625151122430](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625151122430.png)

#### 继承

##### 基本实现

Java不支持多重继承，每个类只能有一个父类

可以重写父类中的成员变量和成员方法

```java
//通过继承创建子类
class SubClass extends SuperClass{

}
```

重写后会隐藏父类的实现

```java
class SuperClass{
    int x;
    void setX() {
        this.x = 10;
    }
}
public class SubClass extends SuperClass{
    int x;
    @Override
    void setX(){
        this.x = 20;
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.setX();
        System.out.println(s.x);
    }
}

```

##### 父类与子类的构造

```java
class SuperClass{
    int x;
    void setX() {
        this.x = 10;
    }
    SuperClass() {
        System.out.println("SuperClass()调用");
    }
}
class SubClass extends SuperClass{
    int x;
    @Override
    void setX(){
        this.x = 20;
    }
    SubClass(){
        System.out.println("SubClass()调用");
    }

}

public class TestInheritance{
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
    }
}
```

![image-20250625205458749](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625205458749.png)

构造子类前会先构造父类

```java
class SuperClass{
    int x;
    void setX() {
        this.x = 10;
    }
    SuperClass() {
        System.out.println("SuperClass()调用");
    }
    SuperClass(int a) {
        System.out.println("SuperClass(int a)调用");
    }
}
class SubClass extends SuperClass{
    int x;
    @Override
    void setX(){
        this.x = 20;
    }
    SubClass(){
        super(10);
        System.out.println("SubClass()调用");
    }

}

public class TestInheritance{
    public static void main(String[] args) {
        SubClass s1 = new SubClass();
    }
}
```

![image-20250625205616334](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625205616334.png)

父类的构造函数可以人为手动调用，要求必须在子类构造函数第一行调用，可以调用任意一个构造函数

如果人为不调用，那么编译器会自动调用默认构造函数，如果人为不调用构造函数，同时默认构造函数又没有生成，那么会报错

（与c++基本一致）

##### 隐藏和覆盖

隐藏：子类中声明了和父类同名得属性，此时父类的属性被隐藏

注意此时从父类继承来的属性仍然存在，也就是**子类中存在两个同名的属性**

**当子类执行自己定义的方法时，操作的是子类自己定义的属性，当执行从父类继承而来的方法时，操作的是从父类继承来的属性**

例子：

```java
class SuperClass {
    int x = 2;
    public void print1() {
        System.out.println("SuperClass,x=" + x);
    }
    public void add1() {
        x += 2;
    }
}

class SubClass extends SuperClass {
    int x = 100;
    public void print2() {
        System.out.println("SubClass,x=" + x);
    }
    public void add2() {
        x += 2;
    }
}

public class Hide {
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.print1();
        sc.print2();
        sc.add1();
        sc.print1();
        sc.print2();
        sc.add2();
        sc.print1();
        sc.print2();

    }
}
```

运行结果

![image-20250627182550156](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250627182550156.png)

方法覆盖：

如果子类不需使用从超类继承来的方法的功能，则可以声明自己的同名方法， 称为方法覆盖 

• 覆盖方法的返回类型，方法名称，参数的个数及类型必须和被覆盖的方法一模一样 

• 只需在方法名前面使用不同的类名或不同类的对象名即可区分覆盖方法和被覆盖方法 

• 覆盖方法的访问权限可以比被覆盖的宽松，但是不能更为严

##### **super**

用来引用当前对象的父类：

1. 访问父类中被隐藏的变量：super.variable
2. 访问父类中被隐藏的成员方法：super.Method()
3. super()可以调用父类的构造方法

#### 多态

#### 方法的查找

* 实例方法的查找

从对象创建时的类开始，沿着继承层次向上查找，并且调用**第一次**查找到的方法

1. 当超类和子类中声明了同样的方法，使用超类的引用指向子类的对象，并且调用该方法，则会从实际指向的对象开始查找，在子类这种查找到了对应的方法，并且调用

```java
class SuperClass1{
    public void method1(){
        System.out.println("SuperClass1 method1");
    }
}

class SuperClass2 extends SuperClass1{
    @Override
    public void method1(){
        System.out.println("SuperClass2 method1");
    }
}

class SubClass1 extends SuperClass2{
    @Override
    public void method1(){
        System.out.println("SubClass method1");
    }
}

public class FindMethdods {
    SuperClass1 s = new SubClass1();
    public void test(){
        s.method1();
    }
    public static void main(String[] args) {
        new FindMethdods().test();
    }
}
```

从SubClass1开始查找，发现SubClass1中就有这个方法，所以直接调用SubClass1中的这个方法

2. 当超类中声明了某方法但是子类中没有，则会从子类开始向上查找超类，找到第一次声明了该方法的超类并且调用（注意不一定时引用的类型）

   ```java
   class SuperClass1{
       public void method1(){
           System.out.println("SuperClass1 method1");
       }
   }
   
   class SuperClass2 extends SuperClass1{
       @Override
       public void method1(){
           System.out.println("SuperClass2 method1");
       }
   }
   
   class SubClass1 extends SuperClass2{
   }
   
   public class FindMethdods {
       SuperClass1 s = new SubClass1();
       public void test(){
           s.method1();
       }
       public static void main(String[] args) {
           new FindMethdods().test();
       }
   }
   ```

从SubClass1开始查找，发现SubClass1中没有该方法，接着查找SuperClass2，发现该方法，调用

虽然引用的类型是SuperClass1，但是调用的是SuperClass2的方法

* 类方法的查找

  ```java
  class SuperClass1{
      public static void SMethods() {
          System.out.println("SuperClass1 static method");
      }
      public void method1(){
          System.out.println("SuperClass1 method1");
      }
  }
  
  class SuperClass2 extends SuperClass1{
      public static void SMethods() {
          System.out.println("SuperClass2 static method");
      }
      @Override
      public void method1(){
          System.out.println("SuperClass2 method1");
      }
  }
  
  class SubClass1 extends SuperClass2{
      public static void SMethods() {
          System.out.println("SubClass1 static method");
      }
  }
  
  public class FindMethdods {
      public void test(){
          SuperClass1 s = new SubClass1();
          s.method1();
          s.SMethods();
      }
      public static void main(String[] args) {
          new FindMethdods().test();
      }
  }
  ```

类方法不会发生多态，在编译期间就根据引用的类型来确定了选哟调用的函数，所以类方法调用跟实际指向的对象类型无关，只和引用变量的类型有关

![image-20250628100425737](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628100425737.png)



#### 多态的实现

静态多态：由方法重载来实现

动态多态：由方法重写实现==注意动态多态只会在实例方法中发生，不会在类方法中发生，因为类方法一定是早绑定的==

* 基类的引用可以引用派生类的对象
* 当使用基类的引用来调用经过重写的方法时，会根据引用的对象来决定实际调用==（发生晚绑定）==
* 示例：

```java
class M{
    M() {
        System.out.println("M()");
    }
    void callMe() {
        System.out.println("callMe in M");
    }
}
class N extends M {
    N() {
        super();
        System.out.println("N()");
    }
    @Override
    void callMe() {
        System.out.println("callMe in N");
    }
}
public class Poly {
    public static void main(String[] args) {
        //这里使用M类的引用来指向N类的对象，在使用该引用调用重写的方法时，会根据其指向的对象来决定具体调用哪个方法
        M m = new N();
        m.callMe();
    }
}
```

![image-20250626102858159](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250626102858159.png)

* 方法重写的规则：

  1. 重写后的方法访问权限不能比父类中的方法更严格

     比如说父类中的方法访问权限是default，那么子类中的重写方法访问权限只能是default,protected,public

     示例：

     ```java
     class Parent {
         public void sayHello() {
             System.out.println("Hello from parent");
         }
     }
     
     class Child extends Parent {
         private void sayHello() {
             System.out.println("Hello from child");
         }
     }
     
     调用：
     Parent p = new Child();
     p.sayHello(); // 实际调用子类方法
     ```

     应该能够通过父类的引用p实现多态调用，但是实际情况中父类的引用可以调用父类中的方法，但是由于权限的问题无法调用子类中的方法

  2. 重写后的方法声明的异常不能比父类更多

     因为异常是编译器**静态检查**的一部分，编译时会根据父类声明的异常来进行异常处理，如果子类声明了父类没有的异常，那么可能会造成多态调用时抛出无法进行处理的异常







![image-20250625154551502](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625154551502.png)

C：子类中重写的方法访问权限不能比父类中的方法更严格

D：不是抽象类，不能声明抽象方法

#### final

![image-20250625154542870](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625154542870.png)

![image-20250625154655786](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625154655786.png)

1. 修饰变量：成为常量（java中不使用const关键字，而是使用final来声明常量）

   ```java
   public class TestFinal {
       public static void main(String[] args) {
           final int a;
           a = 10;
           //a = 20;报错，a是常量，第一次赋值后就不能进行修改
       }
   }
   ```

   

2. 修饰方法：方法不能被子类重写

   ```java
   class B {
       public final void test() {
           
       }
   }
   
   class C extends B{
       /*public void test() {
           
       }*/报错，显示final方法不能被重写
   }
   ```

3. 修饰类：类不能被继承

   ```java
   class B {
       public final void test() {
   
       }
   }
   
   final class C extends B{
   }
   
   class D extends C{//报错，显示无法继承字final类C
       
   }
   ```

#### static

实例变量：

1. 每个对象的实例变量都分配内存
2. 通过对象来访问实例变量

类变量：

1. 所有实例变量共享一个类变量
2. 类变量可以通过类名进行访问，无序创建对象
3. 也可以通过对象来访问类变量

类方法：

1. 类方法不能访问实例变量，只能访问类变量（类方法是类所共有的，所以没有办法找到某个特定的实例变量）
2. 类方法可以直接使用类名调用
3. 类方法不能使用this和super

![](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625155315904.png)

#### Inner Class

内部类是定义在类内部的类

1. 成员内部类：可以访问类中所有成员变量

2. 静态内部类：能够访问类中所有静态变量

3. 局部内部类：定义在方法里面的类，作用域仅限于方法中

4. 匿名内部类：直接创建类的实例并且定义方法体

内部类表达的意义类似与类的组合，也就是类的组成部分也需要用一个类来描述，这时候可以创建一个外部类，在将其组合进去，也可以创建一个内部类

内部类的优点：

1. 实现更好的封装：内部类只在外部类中有效，在其他类中是不可见的，这样可以将这个类更好的封装起来
2. 访问权限：内部类可以访问外部类中私有属性的成员变量，而使用外部类组合只能通过接口访问或是访问共有成员变量
3. 表达更加紧密的从属关系

* 使用外部类组合：

  ```java
  class Heart{
      public void beat(Person1 p) {
          System.out.println("I am beating" + "blood" + p.getBlood());
      }
  }
  
  //Brain类，里面有方法think,需要调用IQ，此时则需要将Person类作为参数传入，并且需要在Person类中定义获取IQ的方法
  class Brain{
      public void think(Person1 p) {
          System.out.println("I am thinking" + "IQ" + p.getIQ());
      }
  }
  
  //而且Brain和Heart类都是独立的类，封装性没那么好，其他类也可以访问
  
  
  //Person类，里面有两个器官：心脏和大脑，需要使用类来进行描述，还有blood和IQ两个成员变量
  public class Person1 {
      private int blood;
      private int IQ;
      private Heart heart;
      private Brain brain;
      public int getBlood() {
          return blood;
      }
      public void setBlood(int blood) {
          this.blood = blood;
      }
      public int getIQ() {
          return IQ;
      }
      public void setIQ(int iQ) {
          IQ = iQ;
      }
      Person1() {
          blood = 100;
          IQ = 100;
          heart = new Heart();
          brain = new Brain();
          System.out.println("I am born");
      }
  
      public static void main(String[] args) {
          Person1 p = new Person1();
          p.heart.beat(p);
          p.brain.think(p);
      }
  
  }
  ```



* 使用内部类：

  ```java
  public class Person2 {
      private int blood;
      private int iQ;
      //注意这里存的只是引用，要在构造函数中构造这两个对象
      private Heart heart;
      private Brain brain;
      //将心和脑都设为内部类，这样成员方法可以直接访问成员变量，调用更加方便
      //而且内部类只在Person类中有效，这样增强了封装性
      public class Heart{
          public void beat()
          {
              System.out.println("I am beating, blood " + blood);
          }
      }
      public class Brain{
          public void think()
          {
              System.out.println("I am thinking, iQ " + iQ);
          }
      }
      Person2() {
          iQ = 100;
          blood = 100;
          heart = new Heart();
          brain = new Brain();
      }
  
      public static void main(String[] args) {
          Person2 p = new Person2();
          p.heart.beat();
          p.brain.think();
      }
  
  }
  ```





#### 抽象类

用abstract修饰的类

用abstract来修饰，只有方法头，没有方法体的方法是抽象方法

抽象类不能创建实例，一般通过子类继承抽象类，并且重写所有的抽象方法，然后可以实例化子类

如果类中包含抽象方法，则必须定义为抽象类

* 作用

  1. 定义一些类的共同父类，表示共同的行为和属性，便于进行面向对象的设计

     ![image-20250625160920742](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250625160920742.png)

	   

### 接口

继承表示is-a关系，表示事物的本质，接口表示can-do关系，表示一种规范的行为，接口偏重描述行为，更加灵活。一般用一个主要基类来描述对象本质，再实现若干接口来辅助描述对象的行为。相比于多继承，这样的设计更灵活，并且降低了复杂度

继承关系对于对象的行为描述并不完整，可能某一个行为不是同一个类族中的类所共有的，也可能某一个行为是很多个类族中的类所共有的

这个时候想要描述这个行为并且实现多态调用，如果不使用接口，则有以下可能：

1. 将这个行为加到基类中：但是不是所有派生类都有这个行为，这样会导致结构混乱和浪费
2. 将类的继承关系进行细分：增加了复杂度

所以使用接口来描述这个行为，可以简化代码，并且使结构更清晰

(1)通过接口实现不相关类的相同行为,而无需考虑这些类之间的关系. 

(2)通过接口指明多个类需要实现的方法

(3)通过接口了解对象的交互界⾯,而无需了解对象所对应的类



接口中可以定义常量和方法

接口中的成员变量一定是final static的

成员方法一定是public的

接口中定义的常量自动为public类型

在实现接口中的方法时，记得声明为public

让类实现接口：1.声明接口:implement InterfaceName   2.实现接口中所有方法

==不能构造接口类型的对象，但是可以声明接口类型的变量，该变量可以引用任何实现了接口的类对象==

==使用接口类型的变量只能调用接口中的方法，并且可以实现多态调用==

==接口可以实现安全的类型转换，即接口类型变量可以强制转换为其引用的对象类型（或其父类）的变量==



示例：

```java
abstract class Animal {
    public abstract void move (String destination);
    public abstract void drink ();
}

abstract class Mammel extends Animal {
}

abstract class Raptile extends Animal {

}

class tiger extends Mammel {
    private static String name = "tiger";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }

}

class Rabbit extends Mammel {
    private static String name = "rabbit";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
}

class snake extends Raptile {
    private static String name = "snake";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
}

class turtle extends Raptile {
    private static String name = "turtle";
    @Override
    public void move (String destination) {
        System.out.println(name + " is moving to " + destination);
    }
    @Override
    public void drink() {
        System.out.println(name + " is drinking water");
    }
 }


public class Famer {
    public void bringWater(String  destination) {
        System.out.println("Bring water to " + destination);
    }
    public void feedWater(Animal animal, String destination) {
        bringWater(destination);
        animal.move(destination);
        animal.drink();
    }
    public static void main(String[] args) {
        Famer famer = new Famer();
        famer.feedWater(new tiger(), "home");
        famer.feedWater(new Rabbit(), "home");
        famer.feedWater(new snake(), "home");
        famer.feedWater(new turtle(), "home");
    }
}
```

抽象基类为Animal,其派生出Mammel和Raptile，Mammel派生出Tiger和Rabbit,Raptile派生出Turtle和Snake

这四个类分别重写了抽象基类中的move和drink函数

Fammer类中有feedWater方法，传入基类引用animal，可以实现多态调用

现在想要增加一个hunt行为，其中Tiger和Snake可以hunt，其他的不可以,famer实现bringHunt函数

解决方案：

1. 在Tiger和Snake内增加hunt函数，但是这样在Famer类中就需要进行重载bringHunt

   ```java
    public void bringHunt(Tiger tiger , Animal animal){  
           bringFood("Feeding Room");
           tiger.move("Feeding Room"); 
           tiger.hunt(animal);
       }  
    public void bringHunt(Snake snake, Animal animal){  
           bringFood("Feeding Room"); 
           snake.move("Feeding Room"); 
           snake.hunt(animal);
       }  
   ```

   

2. 细分继承关系：导致类划分复杂

3. 实现Hunt接口，bringHunt函数中传入Hunt的引用，实现多态

   ```java
   abstract class Animal {
       public abstract void move (String destination);
       public abstract void drink ();
   }
   
   abstract class Mammel extends Animal {
   }
   
   abstract class Raptile extends Animal {
   
   }
   
   interface Hunt{
       public void hunt();
   }
   
   class tiger extends Mammel implements Hunt{
       private static String name = "tiger";
       @Override
       public void move (String destination) {
           System.out.println(name + " is moving to " + destination);
       }
       @Override
       public void drink() {
           System.out.println(name + " is drinking water");
       }
       @Override
       public void hunt() {
           System.out.println(name + " is hunting");
       }
   
   }
   
   class Rabbit extends Mammel {
       private static String name = "rabbit";
       @Override
       public void move (String destination) {
           System.out.println(name + " is moving to " + destination);
       }
       @Override
       public void drink() {
           System.out.println(name + " is drinking water");
       }
   }
   
   class snake extends Raptile implements Hunt{
       private static String name = "snake";
       @Override
       public void move (String destination) {
           System.out.println(name + " is moving to " + destination);
       }
       @Override
       public void drink() {
           System.out.println(name + " is drinking water");
       }
       @Override
       public void hunt() {
           System.out.println(name + " is hunting");
       }
   }
   
   class turtle extends Raptile {
       private static String name = "turtle";
       @Override
       public void move (String destination) {
           System.out.println(name + " is moving to " + destination);
       }
       @Override
       public void drink() {
           System.out.println(name + " is drinking water");
       }
    }
   
   
   public class Famer {
       public void bringWater(String  destination) {
           System.out.println("Bring water to " + destination);
       }
       public void feedWater(Animal animal, String destination) {
           bringWater(destination);
           animal.move(destination);
           animal.drink();
       }
       public void bringFood(String destination) {
           System.out.println("Bring food to " + destination);
       }
       //使用接口变量来传递实现了接口的类的引用
       public void feedFood(Hunt hunter, String destination) {
           bringFood(destination);
           //实现类型转换
           Animal animal = (Animal) hunter;
           animal.move(destination);
           //使用接口类型变量来调用接口中的方法可以实现多态调用
           hunter.hunt();
       }
       public static void main(String[] args) {
           Famer famer = new Famer();
           famer.feedWater(new tiger(), "home");
           famer.feedWater(new Rabbit(), "home");
           famer.feedWater(new snake(), "home");
           famer.feedWater(new turtle(), "home");
           famer.feedFood(new tiger(), "home");
           famer.feedFood(new snake(), "home");
       }
   }
   ```



接口可以进行继承：

```java
//Shape接口
interface Shape{
    double pi = 3.14;
    void setColor(String c);
}
//Shape接口派生出Shape2D和Shape3D接口
interface Shape2D extends Shape {
    void area();
}

interface Shape3D extends Shape {
    void volunme();
}
//实现接口
class Circle implements Shape2D {
    private String color;
    private double radius;
    @Override
    public void setColor(String c) {
        System.out.println("Circle: " + c);
        color = c;
    }
    @Override
    public void area() {
        System.out.println("Area of " + color + " circle is " + pi * radius * radius);
    }
    public void setRadius(double r) {
        radius = r;
    }

}

class Sphere implements Shape3D {
    private String color;
    private double radius;
    @Override
    public void setColor(String c) {
        System.out.println("Sphere: " + c);
        color = c;
    }
    @Override
    public void volunme() {
        System.out.println("volunme of " + color + " sphere is " + 3 * pi * radius * radius * radius/4);
    }
    public void setRadius(double r) {
        radius = r;
    }
}


public class TestInterface {
    public static void main(String[] args) {
        //可以使用接口变量来引用实现了接口的对象
        Shape s = new Circle();
        Shape s1 = new Sphere();
        //可以使用接口变量来调用接口方法，并且可以根据实际指向的对象来实现多态调用
        s.setColor("red");
        s1.setColor("blue");
        //接口变量可以强制转换为实际指向的对象或其父类的引用
        Circle c = (Circle)s;
        Sphere sp = (Sphere)s1;
        c.setRadius(5.0);
        sp.setRadius(5.0);
        c.area();
        sp.volunme();

    }
}
```

#### 比较接口

1. 使用comparable<T>接口:里面有compareTo方法，一般定义为a.compareTo(b)如果a>b则返回正数，a<b返回负数，a=b返回0，当调用Collections.sort(数组)时会自动调用数组类型的compareTo方法

2. 使用comparator<T>接口：里面有compare方法，同样定义为compare(a,b)如果a>b返回正数，当调用Collections.sort(数组，comparator<T>类对象)时会使用compare方法进行比较

3. sort方法会按照定义好的方法规则进行升序排序

   ```java
   import java.util.Arrays;
   import java.util.Comparator;
   import java.util.List;
   
   //类本身实现Comparable接口
   class People implements Comparable<People>{
       String name;
       int age;
       int salary;
       public People(String name, int age, int salary) {
           this.name = name;
           this.age = age;
           this.salary = salary;
       }
       @Override
       public String toString() {
           return name + " " + age + " " + salary;
       }
       @Override
       public int compareTo(People p) {
           double rate = (double)salary / age;
           double rate2 = (double)p.salary / p.age;
           //前面小则返回负数
           if(rate < rate2) {
               return -1;
           }
           else if(rate > rate2) {
               return 1;
           }
           else{
               return 0;
           }
       }
   
   }
   
   //实现专门的comparator接口
   class PeopleComparator implements Comparator<People> {
       @Override
       public int compare(People p1, People p2) {
           return p1.age - p2.age;
       }
   }
   
   
   
   public class Compare {
       public static void main(String[] args) {
           People[] p =  new People[4];
           p[0] = new People("Tom", 18, 5000);
           p[1] = new People("Jerry", 20, 6000);
           p[2] = new People("Mike", 19, 7000);
           p[3] = new People("Kate", 18, 8000);
           //直接排序则会使用类本身实现的compareTo方法
           //sort方法是按照定义的比较方法升序排列
           Arrays.sort(p);
           for(People people : p) {
               System.out.println(people.toString());
           }
           System.out.println("--------------------------------");
           PeopleComparator pc = new PeopleComparator();
           //可以指定比较器
           Arrays.sort(p, pc);
           for(People people : p) {
               System.out.println(people.toString());
           }
       }
   }
   ```

![image-20250630102947114](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630102947114.png)

### 泛型

将类型作为参数，增加程序的通用性

有泛型类，泛型方法，泛型接口

#### 泛型的实现原理

类型擦除：

上限类型：
常见情况：1.没有指定，默认为object   2.使用语法<T extends Type>来指定上限类型为Type

在编译期，编译器会做以下事情：

1. 将所有泛型参数替换为**上限类**

2. 进行静态类型检查，保证类型和泛型的类型一致

3. 插入强制类型转换

   也就是运行时使用了泛型参数的地方类型均为上限类，然后通过强制类型转换将上限类对象转换为目标类对象

   例子：

   ```java
   class Box<T> {
       private T value;
       public void set(T value) { this.value = value; }
       public T get() { return value; }
   }
   //使用代码
   Box<String> box = new Box<>();
   box.set("hello");
   String str = box.get();
   ```

   在编译时：

   1. 类型擦除，将T替换为object

      ```java
      class Box{
          private object value;
          public void set(object value) { this.value = value; }
          public object get() { return value; }
      }
      ```

   2. 静态类型检查

      检查泛型参数相关部分是否类型匹配

      `box.set("hello");`传入参数是String类型的，`String str = box.get();`str是String类型的，与返回值相同

   3. 插入强制类型转换，将所有的object类转换为String类

      `String str = (String)box.get();`

   ==注意泛型参数不能使用基本类型，因为泛型参数需要进行类型擦除，而基本数据类型无法进行，可以使用基本类型的包装类==

#### 泛型类

泛型类中，非静态成员属性，非静态成员方法的返回值，非静态成员方法的参数可以使用泛型，注意==静态成员不能使用泛型声明的类型参数==（泛型参数是在实例化对象时才确定的，而静态成员在类加载的时候就已经确定了）

```java
public class GenericClass<T> {
    //成员变量使用泛型参数
    private T value;
    //构造方法使用泛型参数
    public GenericClass (T value) {
        this.value = value;
    }
    //函数返回值使用泛型参数
    public T getKey() {
        return value;
    }

    public static void main(String[] args) {
        //使用Integer作为泛型参数
        GenericClass<Integer> genericClass = new GenericClass<Integer>(123);
        System.out.println(genericClass.getKey());
        //使用String作为泛型参数
        GenericClass<String> genericClass2 = new GenericClass<String>("hello world");
        System.out.println(genericClass2.getKey());
    }

}
```

#### 泛型方法

定义：[public] <T> returnType name(parameter)

在返回值前面用尖括号指定泛型参数

泛型方法中的参数名可以和类的相同，此时会以方法的参数类型为准（但是最好不要定义和类的泛型参数相同名字的参数）

泛型参数可以有多个

使用：

泛型方法使用时不用显式指定泛型参数，编译器会进行自动推断

例子：

```java
public class GenericClass<T> {
    //成员变量使用泛型参数
    private T value;
    //构造方法使用泛型参数
    public GenericClass (T value) {
        this.value = value;
    }
    //函数返回值使用泛型参数
    public T getKey() {
        return value;
    }

    //注意前面的方法都只是使用了泛型类中的泛型参数，下面才是一个泛型方法，应该在返回值前面使用尖括号来声明泛型参数
    //注意类定义的泛型参数和方法定义的泛型参数是完全独立的
    public <U> U test(U u) {
        System.out.println(u);
        return u;
    }
    //泛型方法的泛型参数可以和类的相同，此时以方法为准
    public <T> T test2(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        //使用Integer作为泛型参数
        GenericClass<Integer> genericClass = new GenericClass<Integer>(123);
        System.out.println(genericClass.getKey());
        //使用String作为泛型参数
        GenericClass<String> genericClass2 = new GenericClass<String>("hello world");
        System.out.println(genericClass2.getKey());
        //使用泛型方法无需指定泛型参数，编译器会根据传入的参数自动确定
        System.out.println(genericClass2.test("hello world"));
        System.out.println(genericClass2.test2(123.1));

    }

}
```

![image-20250627205919175](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250627205919175.png)

### 类型转换

引用变量的类型转换：

引用变量的类型转换不会改变其指向对象的类型

//能否转换看的是实际指向的对象的类型，只要是转到实际指向对象本身或是更高的类型或接口都可

1. 向上转型：转换为指向对象的直接或间接的超类
2. 向上转型：转换为指向对象直接或间接实现过的接口类型
3. 向下转型：（从指向对象实现的接口类型或是指向对象的超类类型）转换为指向的对象本身的类型

当向上转换为超类引用或是接口引用后，通过它只能够访问超类或接口中实现的方法

隐式类型转换：

1. 基本类型，从容量低的转换为容量高的

   //这里看的是引用本身的类型

2. 引用类型，转换为引用本身类型的超类

3. 引用类型，转换为引用本身类型实现过的接口





## 异常处理和输入输出流（lesson3）





### 异常处理

#### 异常的概念

异常是一种特殊的运行错误**对象**

java中声明了很多异常类,每种异常类都包含：1.该异常的信息  2.处理该异常的方法

每当java程序运行时发生了可识别的运行错误时，该错误都有一个**异常类**与之对应，系统就会产生一个该异常类的对象并提交给运行时系统，即抛出（throw）一个异常

运行时系统得到异常对象后会去寻找能够处理异常的方法，并将异常交给这个方法处理，称为捕获(catch)异常

如果没有找到捕获异常的地方，则停止运行

* 异常是一个对象,里面封装了异常信息和处理方法
* 每当出现运行错误，系统都会创建异常对象

处理异常的方法：

1. 程序中不处理异常，将异常抛出给java虚拟机，Java虚拟机捕获异常，给出异常信息并且终止程序
2. 在自己的程序中捕获异常并且处理异常（try-catch语句）

错误的分类：

1. 错误：

   致命性的，程序无法处理的

   Error类是所有错误类的超类

   无法使用try-catch语句进行捕获处理，程序会停止运行并且抛出错误信息

2. 异常:

   非致命性的，可以由程序捕获和处理

   Exception类是所有异常类的超类

   异常的分类：

   1. 非检查型异常：

      不期望程序捕获的异常，无需声明，编译器也不进行检查

      编译时不会产生错误，但是运行时遇到了会报错

      ```java
      public static void main(String[] args) {
          int[] a = new int[4];
          System.out.println(a[5]);
      }
      ```

      

      ![image-20250628113014823](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628113014823.png)

      ```java
      //使用try-catch语句捕获并且处理
      public static void main(String[] args) {
          int[] a = new int[4];
          try {
              System.out.println(a[5]);
          }
          catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Array index out of bound");
          }
          try {
              int c = 1 / 0;
          }
          catch (ArithmeticException e) {
              System.out.println("Divide by zero");
          }
      }
      ```
   
      
   
      继承自RuntimeException
   
      原因：
   
      * 引发RuntimmeException的操作在程序中往往会频繁出现，例如使用空引用的异常，如果每次使用对象都要写一个try-catch来捕获空引用的错误就太麻烦了
      * 这些异常表示的问题可以使用检查性语句来处理，不需要将其作为异常来处理。你如除数为0的问题可以提前检查除数，空引用的问题可以提前检查引用是否为空
   
   2. 检查型异常：
   
      必须捕获并检查
   
      编译器强制要求在可能产生检查型异常的地方进行异常处理，否则会报错
   
      例子：
   
      ```Java
      public static void main(String[] args) {
          FileReader fr = new FileReader("test.txt"); // 编译失败！没有处理FileNotFoundException
      }
      ```
      
      修改：
      
      ```java
      public static void main(String[] args) throws FileNotFoundException {//声明异常
          FileReader fr = new FileReader("test.txt"); 
      }
      ```
      
      
      
      或是使用try-catch语句捕获
      
      ```java
      public class CheckedException {
          public static void main(String[] args) throws FileNotFoundException {
              try {
                  FileReader fr = new FileReader("test.txt");
              }
              catch (FileNotFoundException e) {
                  e.printStackTrace();
              }
          }
      }
      ```
      
      
   
   

#### 异常处理

发生异常后有两种处理方法：

1. 捕获并且处理异常

2. 将异常向上抛出给其调用者方法（可以声明抛出异常但是不处理异常，将异常交给调用者处理，知道有合适的方法将该异常捕获）

   如果一直不处理异常，则最后会将异常抛出给java虚拟机，然后给出异常信息并且终止程序

   ```java
   class Test2 {
       void method1() throws ArithmeticException{
           int a = 1/0;//在method1中抛出异常但是不处理，异常会被抛出到调用者方法
           System.out.println("Inside method1");//注意异常语句之后的语句不会被执行了
       }
   
       void method2() {
           method1();//调用了method1，接受了method1抛出的异常，但是不处理，继续抛出
       }
   
       void method3() {
           method2();//调用了method2，接受了method2抛出的异常，但是不处理，继续抛出
       }
       void method4() {
           try {
               method3();//调用了method3，接受了method3抛出的异常
               
           }
           catch (ArithmeticException e) {//将异常进行捕获并且处理
               System.out.println("Caught");
               e.getMessage();//输出异常信息
               e.printStackTrace();//输出调用栈
           }
       }
   }
   
   public class TryCatch {
       public static void main(String[] args) {
           Test2 t = new Test2();
           t.method4();
       }
   }
   ```



![image-20250628120330396](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628120330396.png)



![image-20250630104008005](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630104008005.png)

![image-20250628114831458](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628114831458.png)

如果有多个catch语句，则执行了一个合适的catch语句之后就不会在向后执行了，所以要将特殊的异常放在前面

注意产生异常的语句后面的代码不会被执行



有一些类的API会声明可能抛出的异常，所以调用这些方法的时候要进行异常处理

![image-20250630110432386](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630110432386.png)

### 输入输出流

#### 基本概念

将输入输出抽象为信息的流动

预定义的I/O流类

* 从方向：

  方向是以程序的视角来说的

  1. 输入流：读到程序中
  2. 输出流：从程序输出

* 从功能：
  1. 节点流
  2. 处理流
  
* 从内容
  1. 字符流（处理文本）：以字符为最小处理单元（16位unicode）
  
     ![image-20250630111630605](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630111630605.png)
  
  2. 字节流（处理二进制文件）：以字节为最小处理单元![image-20250630111603465](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630111603465.png)
  
  3. 对象流：以对象位读写单位（对象的引用，32位）
  
     ![image-20250630111728560](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630111728560.png)

用于读写的流：

![image-20250628122806034](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628122806034.png)

#### 标准输入输出对象

均为System类中的静态对象，可以使用类名System来直接调用

1. System.in:是InputStream类的对象，标准输入流，用于接受从键盘的输入
2. System.out:是PrintStream类的对象，标准输出流，用于向屏幕输出
3. System.err:是PrintStream类的对象，标准错误信息输出流

Scanner类：是处理流，用于将读取进来的内容赋予类型特征

#### InputStream

![image-20250630112407630](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630112407630.png)

`long skip(long n)`表示跳过n个字节，返回值是实际跳过的字节数

#### 文件描述

类File提供了一种与机器无关的方式用来描述一个文件的属性（不同的操作系统中文件路径的描述不同）

File中可访问的成员变量：

```java
pathSeparator`, `pathSeparatorChar`, `separator`, `separatorChar
```

均为静态常量，pathSeparator表示文件路径分割符（如;）

separator表示目录层级分割符(如`\`)

私有成员变量：path用于具体储存文件的路径

解决跨平台问题：不同操作系统中文件的分隔符不同(比如`\`和`/`)，java在拼接文件路径的时候会避免使用具体的分隔符号，而是使用静态变量`pathSeparator`和`separator`，然后jvm会根据具体的操作系统来输出对应的分隔符

`// 跨平台安全的路径拼接
File file = new File("data" + File.separator + "test.txt");`

##### 构造方法

1. `File(String path)`通过完整的路径字符串来进行构造，`File file1 = new File("C:/test/demo.txt");`
2. `File(String path, String name)`通过父路径字符串和文件/文件夹名字来构造，比如说`File file = new File("C:/test", "demo.txt"); `表示路径c:/test文件夹下面的demo.txt文件对象
3. `File(File path, String)`通过父路径File对象和文件/目录名来创建

##### 文件名处理

![image-20250630145827229](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630145827229.png)

* getName()方法只能得到文件名，不包含目录

* getPath得到文件构造时的原始路径，可能是相对或绝对
* getAbsolutePath得到绝对路径，如果原始路径是相对路径会自动补全
* getParent得到文件的上一级目录名称
* renameTo将当前文件名更改为提供的文件对象的路径

##### 文件属性

![image-20250630150159188](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630150159188.png)

##### 文件描述

![image-20250630150253475](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630150253475.png)

注意：

* list()方法的返回值不是字符串，是字符串数组String[]，里面包含了目录下的所有文件（包括文件夹）的名称
* listFiles()方法返回File[]，里面放的是目录下的所有文件的File对象（可以使用这个来递归遍历文件夹）
* list()和listFiles()方法可以接受FilenameFilter参数，用于过滤出符合要求的File对象
* mkdir会创建当前调用该方法的File对象中描述的文件夹，mkdirs类似，区别是mkdir会补全不存在的父目录
* createNewFile可以用于创建文件

综合示例：

```java
import java.io.File;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        //静态常量：文件分隔符
        System.out.println("pathSeparator:"+ File.pathSeparator);
        System.out.println("pathSeparatorChar:"+ File.pathSeparatorChar);
        System.out.println("Separator:" + File.separator);
        System.out.println("SeparatorChar:" + File.separatorChar);
        //使用路径来构造
        File f = new File("D:\\MyJava\\firstTest");
        //判断是否存在
        System.out.println("isExist:" + f.exists());
        //判断是否是文件
        System.out.println("isFile:" + f.isFile());
        //获取名字
        System.out.println("getName:" + f.getName());
        //获取路径
        System.out.println("getPath:" + f.getPath());
        //获取绝对路径
        System.out.println("getAbsolutePath:" + f.getAbsolutePath());
        //获取上一级目录名
        System.out.println("getParent:" + f.getParent());
        //获取文件列表
        String[] fileList = f.list();
        for(String s : fileList) {
            System.out.println(s);
        }
        //获取目录下文件对象
        File[] fileList2 = f.listFiles();
        for(File file : fileList2) {
            System.out.println(file.getName());
        }
        //创建目录
        File f2 =  new File("D:\\MyJava\\firstTest\\test");
        f2.mkdir();
        if(f2.exists()) {
            System.out.println("创建成功");
        }
        //创建文件
        File f3 = new File("D:\\MyJava\\firstTest\\test\\main.cpp");
        try{
            f3.createNewFile();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        if(f3.exists()) {
            System.out.println("创建成功");
        }
        //删除文件
        f3.delete();
        if(!f3.exists()){
            System.out.println("删除成功");
        }
        //删除目录
        f2.delete();
        if(!f2.exists()) {
            System.out.println("删除成功");
        }
        //目录改名
        File f4 = new File("D:\\MyJava\\FirstTest");
        f.renameTo(f4);
        //获取文件大小
        for(File file : fileList2) {
            System.out.println("the length of " + file.getName() + " is " + file.length());
        }

    }
}
```

![image-20250630155309233](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630155309233.png)

##### 文件处理

`FilenameFilter`接口

里面有方法boolean accept(File dir, String name),其中dir表示当前文件所在的文件夹，name表示文件的名称，如果返回值为true在文件夹dir下名字为name的文件就会被过滤出来

一般在list(filter)和listFiles(filter)中使用，并且一般回创建匿名对象来作为参数

##### 综合小工具

使用以上知识制作的一个可以指定删除文件夹中满足wwene条件的文件和文件夹的工具

```java
/*
主方法：deleteSpecialFileInDir(File file, FilenameFilter filter);
接受一个目录和一个实现了FilenameFilter接口的过滤器，删除目录下的所有满足filter的文件。
deleteDir(File file)方法：接受一个file对象，删除file对象代表的目录
实现：如果为空，直接删除，如果不为空，遍历其中的File对象，如果为目录对象，
则调用deleteFile方法进行递归删除，如果是文件对象，则使用delete()方法进行删除。
主过程：遍历file中File对象，如果是满足要求的，直接删除，
对于不满足要求的File对象中的的目录对象进行deleteSpecialFileInDir递归调用
*/


import java.io.File;
import java.io.FilenameFilter;

public class DeleteTool {
    public static void deleteDir(File file) {
        //要求一定是实际存在的目录对象
        if(!(file.exists() && file.isDirectory())) {
            System.out.println(file.getName() + "不是目录对象！");
            return;
        }
        //获取文件夹下面的所有File对象
        File[] filesInDir = file.listFiles();
        //如果是空目录,直接删除即可
        if(filesInDir == null) {
            file.delete();
            return;
        }
        //如果不是空目录，则进行遍历
        for(File f : filesInDir) {
            //若为目录，则递归调用
            if(f.isDirectory()) {
                deleteDir(f);
            }
            else {
                //是普通文件，则使用delete()方法进行删除
                f.delete();
            }
        }
        file.delete();
    }
    public static void deleteSpecialFileInDir(File file, FilenameFilter filter) {
        //要求必须是实际存在的目录对象
        if(!(file.exists() && file.isDirectory())) {
            System.out.println(file.getName() + "不是目录对象！");
            return;
        }
        //获取目录下所有File对象
        File[] filesList = file.listFiles();
        if(filesList == null) {
            System.out.println(file.getName() + "目录为空！");
        }
        for(File f : filesList) {
            //遍历所有File对象，如果其名称满足要求，则删除
            if (filter.accept(file, f.getName())) {
                if (f.isDirectory()) {
                    deleteDir(f);
                }
                else {
                    f.delete();
                }
            }
            //对于名称不满足要求的，如果是目录，就递归，文件不管
            else if(f.isDirectory()){
                // 递归处理未匹配的目录
                deleteSpecialFileInDir(f, filter);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("D:\\桌面\\程序设计");
        //使用一个实现了FilenameFilter接口的匿名对象
        //dir表示当前正在遍历的父目录
        //如果dir中的某文件名在匿名对象中定义的accept方法中返回true,则该对象被过滤出来
        deleteSpecialFileInDir(file, new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                boolean result = false;
                if(name.endsWith(".sln")||name.endsWith(".vcxproj")
                        ||name.endsWith(".filters")||name.endsWith(".user")
                        ||name.equals(".vs")||name.equals("x64")
                   		//这里表示当前文件所处的文件夹名称和当前接受检验的文件夹名称一样
                        ||name.equals(dir.getName())) {
                    result = true;
                }
                return result;
            }
        });
    }
}
```

#### 文件的顺序处理(字节流)

使用FileInputStream类和FileOutputStream类来进行文件的顺序读写

注意这两个类都是字节流，是一个字节一个字节进行读写

==知识点：在utf-8中一个英文字母占1个字节，一个汉字占3个字节==

* 读取文件

```java
public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            //使用文件地址来初始化一个FileInputStream对象
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            int data;
            System.out.println("the content of file is: ");
            //read()方法用于挨个读取，返回的值是字节的ASCII码值，如果读到文件末尾就返回-1
            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            byte[] b = new byte[10];
            int len;
            System.out.println("");
            System.out.println("the content of file is:");
            //read(byte[] b)方法用于批量读取，将读到的字节储存进数组b中
            // 返回值是实际读取的字节数，实际读取到的字节数是文件中的可读字节数和b的容量中的最小值
            while((len = fis.read(b)) != -1) {
                System.out.print("这次读到的字节数是： " + len + " ");
                System.out.println(new String(b, 0, len));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档.txt");
            byte[] b = new byte[10];
            System.out.println("可读字节数： ");
            //使用available()方法获取可读字节数
            System.out.println(fis.available());
            System.out.println("现在跳过10个");
            //使用skip()方法可以跳过一定的字节数，返回值是实际跳过的字节数
            fis.skip(10);
            System.out.println("跳过后的可读字节数： " + fis.available());
            System.out.println("现在开始读取");
            int len;
            //使用read(byte[] b, int off, int len)方法,从数组b的索引off出开始放置，每次最多放len个
            while((len = fis.read(b, 3, 5)) != -1) {
                System.out.print("这次读到的字节数是： " + len + " ");
                System.out.println(new String(b, 3, len));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }
    }
}
```

![image-20250630200626248](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630200626248.png)

==有一个特殊的错误：字节流的读写是一个字节一个字节的，而一个汉字有3个字节，所以使用字节流很容易将汉字字符截断导致乱码==

![image-20250630201526953](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630201526953.png)



* 写入文件

  

  * `fileOutputStream(String path)`构造函数
  * `write(int b)`写入单个字节（使用Ascall码），`write(byte b[])`将数组b整个写入，`write(byte b[],int off,int len)`将数组b从下标off开始的len个字节写入
  * `content.getBytes("UTF-8")`content是一个字符串，该方法用于以指定编码将字符串转化为字符数组

  ```java
  try {
      FileOutputStream ofs = new FileOutputStream("D:\\MyJava\\learnJava\\File\\新建 文本文档 (2).txt");
      //写入单个字符，使用Ascall码
      ofs.write(97);
      ofs.write(98);
      String content = "Hello World";
      byte[] b = content.getBytes("UTF-8");
      byte[] b2 = content.getBytes();
      //写入整个数组b
      ofs.write(b);
      //将数组的从下标3开始的5个字节写入
      ofs.write(b2,3,5);
  
  }
  catch (FileNotFoundException e) {
      System.out.println("文件不存在");
      e.printStackTrace();
  }
  catch (IOException e) {
      System.out.println("文件写入错误");
      e.printStackTrace();
  }
  ```

  ![image-20250630200733461](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630200733461.png)

  同样，如果要使用字节流写入汉字，会发现如果直接将数组写入是正常的，但是如果只是写入一部分数组就有可能会截断

  ![image-20250630202108127](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250630202108127.png)



#### 字符流

* 抽象基类：Reader类和Writer类

* 编码转换流：

  1. InputStreamReader类：将字节流转化为字符流进行读取

  2. OutputStreamWriter类：将字符流转化为字节流输出

     优势：可以指定编码方式

* 文件字符流：FileReader类和FileWriter类，使用默认编码集，编码不可控

* 缓冲字符流：BufferReader和BufferWriter，存在缓冲区，支持整行读取



## java集合框架 

### 概述

集合：一类用来储存多个对象的数据结构（比如Set,List,Vector等等）

集合框架：为了表示和操作集合类型而规定的一种统一的体系结构（为了规范对于集合的操作）。提供了一组通用的接口用于规定一些集合通用的操作（查询，添加，删除等），然后构造不同的类来实现这些接口，从而构造出不同的数据结构

提供了一些现成的数据结构可供使用

将同类型的对象汇聚成整体，方便处理，可以动态改变大小

集合框架的内容：

1. 对外的接口（规定了一些标准的对集合的操作）
2. 实现接口的类（也就是平时常用的一些数据结构）
3. 对集合进行运算的一些算法

集合框架接口：

规定了一些对集合类型的一般操作

![image-20250628185623095](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628185623095.png)

主要又两种类型的接口，一种是Collection,表示对象的集合，一种是Map，表示键值对

这两个根接口又派生出来一些子接口

Collection方法中的一些常见操作：

* int size():返回集合中对象的个数
* boolean isEmpty() : 判断集合中是否还包含有元素
* boolean contains(Object obj):判断对象obj是否在集合中
* boolean add(Object obj):将obj加入集合中
* boolean addAll(Collection<> c):将c的所有元素都加入集合中
* boolean remove(Object obj):删除对象

### 常见数据结构

List:

1. ArrayList:相当于vector

   ```java
   //ArrayList类似cpp中的 vector,可以动态扩容
   ArrayList<String> arrayList = new ArrayList<> ();
   //使用add方法添加元素
   arrayList.add("apple");
   arrayList.add("apple");
   arrayList.add("banana");
   arrayList.add("orange");
   //使用remove方法移除元素
   arrayList.remove("banana");
   arrayList.add("pear");
   //使用set方法修改下表为idx的元素
   arrayList.set(1, "watermelon");
   //不能使用[]访问元素，应该使用get方法
   System.out.println("索引1的元素是" + arrayList.get(1));
   //java中提供了toString方法，打印数组
   System.out.println("Array: " + arrayList);
   //可以遍历
   for(int i = 0; i < arrayList.size(); i++) {
       System.out.println(arrayList.get(i));
   }
   ```

   ![image-20250628193803885](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628193803885.png)

2. LinkedList:相当于list和deque的结合体，底层实现是链表，增删方便

   ```java
   //LinkedList
   //操作是类似的，只是可以定向增，删，查首末元素
   LinkedList<String> linkedlist = new LinkedList<> ();
   linkedlist.add("apple");
   linkedlist.addFirst("orange");
   linkedlist.addLast("pear");
   System.out.println("LinkedList: " + linkedlist);
   System.out.println("第一个元素是" + linkedlist.getFirst());
   System.out.println("最后一个元素是" + linkedlist.getLast());
   //可以使用下标遍历
   for(int i = 0; i < linkedlist.size(); i++) {
       System.out.println(linkedlist.get(i));
   }
   //可以使用迭代器遍历
   Iterator<String> it = linkedlist.iterator();
   while(it.hasNext()) {
       System.out.println(it.next());
   }
   linkedlist.removeFirst();
   linkedlist.removeLast();
   System.out.println("LinkedList: " + linkedlist);
   ```

![image-20250628200015606](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628200015606.png)

Set:

1. HashSet:无序，不重复

   ```java
   //Set
   HashSet<String> hashSet = new HashSet<>();
   //Set中的元素不会重复
   hashSet.add("apple");
   hashSet.add("apple");
   hashSet.add("banana");
   hashSet.add("orange");
   hashSet.add("pear");
   System.out.println("Set: " + hashSet);
   //一样的添加和移除方法
   hashSet.remove("apple");
   System.out.println("Set: " + hashSet);
   //使用迭代器遍历
   it = hashSet.iterator();
   while(it.hasNext()) {
       System.out.println(it.next());
   }
   //使用toArray方法将set转换为数组
   for(int i = 0; i < hashSet.size(); i++) {
       System.out.println(hashSet.toArray()[i]);
   }
   ```

   ![image-20250628200311619](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628200311619.png)

2. LinkedHashSet:保留插入顺序

3. TreeSet:有序，不重复

Map:

1. HashMap:key无序

   ```java
   // Map
   HashMap<Integer, String> hashmap = new HashMap<>();
   //使用put方法来添加元素
   hashmap.put(1, "apple");
   hashmap.put(2, "banana");
   hashmap.put(3, "orange");
   System.out.println("Map: " + hashmap);
   //使用get方法来获取key对应的value
   System.out.println("key为1的元素是：" + hashmap.get(1));
   //使用remove方法来移除key对应的元素
   hashmap.remove(1);
   System.out.println("Map: " + hashmap);
   ```

   ![image-20250628202748348](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628202748348.png)

2. LinkedHashMap：保留插入顺序

3. TreeMap:按照key来排序

Queue:

1. LinkedList

   ```java
   //queue
   //offer方法添加元素，poll方法取出队首元素，peek方法查看队首元素
   LinkedList<String> queue = new LinkedList<>();
   queue.offer("apple");
   queue.offer("banana");
   queue.offer("orange");
   System.out.println("Queue: " + queue);
   //取出队列所有元素
   while(!queue.isEmpty()) {
       System.out.println(queue.poll());
   }
   ```

   ![image-20250628202809593](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250628202809593.png)

2. PriorityQueue:优先队列

Iterator接口：

提供了遍历集合的方法：

hasNext():用于判断是否还有下一个元素

next():返回当前所在元素并且使迭代器后移一个元素

remove():删除掉当前的元素

## 线程（1）

![image-20250628220526751](C:\Users\11379\AppData\Roaming\Typora\typora-user-images\image-20250628220526751.png)

### 线程的概念

线程是程序内部的顺序控制流

线程和进程：

* 每个进程都有独立的代码和内存空间（进程的上下文），进程切换的开销比较大
* 线程则是轻量的线程，同一类线程共享代码和数据空间（就是线程类，同一个类的run()函数和成员变量都相同），每一个线程有独立的栈和程序计数器，线程的切换开销比较小

多进程：操作系统能够同时运行多个进程（程序），比如同时使用浏览器和编辑器，他们每个都占据一个进程，此时对于操作系统来说就是多进程

多线程：同一个应用程序中，多个顺序流同时运行（比如浏览器中同时下载多个图片，服务器同时处理多个请求，用户界面中专门开一个线程来收集用户界面的事件（比如执行某个操作的过程中用户可以终止程序））

java的线程通过Thread类来实现

每个线程通过Thread类对象的run()方法来实现，也就是线程执行过程中就会执行run()方法中的代码

Java中每个线程都有自己的名字，可以使用构造函数来指定名字，如果不指定，则系统会自动给出

### 创建线程的方式

1. 通过Thread类创建线程
   * 从Thread类派生出子类，并且创建子类的对象
   * 子类中重写run()方法，run()方法中放入线程中需要执行的代码
   * 调用start()方法进入线程，此时会自动进入run()方法

```java
//继承了Thread类
class FactorialThread extends Thread{
    //里面可以有成员变量
    private int num;
    public FactorialThread(int num){
        this.num = num;
    }
    //重写了run()方法，这就是线程执行的代码
    @Override
    public void run(){
        System.out.println("the new thread is start");
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("the result is " + result + " for " + num);
        System.out.println("the new Thread is end");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("the main thread is start");
        //创建线程对象
        FactorialThread t1 = new FactorialThread(10);
        //进入线程
        t1.start();
        System.out.println("the main thread is end");
    }


}

```

![image-20250629002632979](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629002632979.png)

注意在这个例子中，主进程结束之后新的线程才开始运行

主线程在调用start()方法后并不会等待新线程，而是继续执行，线程的run()方法在一旁继续运行，不会影响主线程（并行处理）

2. 使用Runnable接口来创建线程
   * 创建方式`Thread t = new Thread(Runnable target)`，其中target是一个实现了Runnable接口的类对象，这里实际上是调用了Thread类的构造函数

```java
//实现Runnable接口
class RunnableThread implements Runnable {
   private int sleepTime;
   public RunnableThread() {
       sleepTime = (int)(6000*Math.random());
   }
   public void run(){
       System.out.println(Thread.currentThread().getName() + " is running");
       System.out.println(Thread.currentThread().getName() + " is sleeping for " + sleepTime + " milliseconds");
       try {
           Thread.sleep(sleepTime);
           System.out.println(Thread.currentThread().getName() + " is done");
       }
       catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }
}


public class TestRunnable {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        //创建实现了Runnable接口的类对象
        RunnableThread t1 = new RunnableThread();
        RunnableThread t2 = new RunnableThread();
        RunnableThread t3 = new RunnableThread();
        //使用Runnale接口来创建线程
        Thread thread1 = new Thread(t1, "Thread 1");
        Thread thread2 = new Thread(t2, "Thread 2");
        Thread thread3 = new Thread(t3, "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

```

![image-20250629134831236](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629134831236.png)

* Runnable接口中只有一个run()方法，所以只需要实现run()方法即可

* Tread类实际上就是实现了Runnable接口

* **便于多个线程共享资源**

​		使用同一个对象创建的多个线程内部的数据是共享的，这样就可以创建出多组线程，同组线程内部数据共享，不同组线程内部数据独立（比如说卖票，每种票的总数是固定的，那么我们可以创建出多个实现了Runnable接口的类对象，每个对象对应一种票，里面规定了票数，再用对象创建出多个线程来卖票）

* **有时某个类已经继承了一个类，但是又想要这个类使用线程，此时就可以通过Runnable接口来实现**

仍然使用start()方法来开启线程

更加灵活，可以通过同一个对象来创建多个线程

### 线程的休眠

线程的执行可能需要等待资源输入，这时候就可以让线程休眠避免浪费资源

可以用于控制请求频率

对刚刚的代码进行修改，加入主线程休眠的语句：

```java
class FactorialThread extends Thread{
    private int num;
    public FactorialThread(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("the new thread is start");
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("the result is " + result + " for " + num);
        System.out.println("the new Thread is end");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("the main thread is start");
        FactorialThread t1 = new FactorialThread(10);
        t1.start();
        try{
            //让主线程休眠1ms
            Thread.sleep(1);
        }
        catch(Exception e){

        }
        System.out.println("the main thread is end");
    }


}


```

![image-20250629122723957](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629122723957.png)

可以发现此时主线程在新线程开始之后才结束，原因就是我们通过Tread.sleep(1)让主线程休眠了1ms

如果休眠时间再久一点：

```java
class FactorialThread extends Thread{
    private int num;
    public FactorialThread(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("the new thread is start");
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        System.out.println("the result is " + result + " for " + num);
        System.out.println("the new Thread is end");
    }
}

public class Test1 {
    public static void main(String[] args) {
        System.out.println("the main thread is start");
        FactorialThread t1 = new FactorialThread(10);
        t1.start();
        try{
            Thread.sleep(10);
        }
        catch(Exception e){

        }
        System.out.println("the main thread is end");
    }


}

```

![image-20250629123040931](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629123040931.png)

可以发现主线程在新线程结束后才开始



案例：

```java
class TestThread extends Thread{
    //休眠的时间
    private int sleepTime;
    public TestThread (String name) {
        //调用父类的构造方法，为线程起名
        super(name);
        //随机生成休眠时间
        sleepTime = (int)(Math.random()*6000);
    }
    @Override
    public void run() {
        System.out.println(getName() + " is running");
        try {
            //休眠
            System.out.println(getName() + " is sleeping for " + sleepTime + " milliseconds");
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + " is done");
    }
}




public class TestSleep {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        TestThread t1 = new TestThread("Thread 1");
        TestThread t2 = new TestThread("Thread 2");
        TestThread t3 = new TestThread("Thread 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The main thread is ending");
    }
}

```

![image-20250629124828808](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629124828808.png)

观察运行结果发现，休眠时间短的线程先结束

### Thread类常用API

![image-20250629130706221](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629130706221.png)

![image-20250629130732556](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629130732556.png)

![image-20250629130753237](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629130753237.png)

### 线程之间数据的共享

使用同一个Runnable对象创建出来的线程会共享对象内的数据和代码

```java
class RunnableThread2 implements Runnable {
    private int sleepTime;
    public RunnableThread2() {
        sleepTime = (int)(6000*Math.random());
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running");
        System.out.println(Thread.currentThread().getName() + " is sleeping for " + sleepTime + " milliseconds");
        try {
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName() + " is done");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class TestShare {
    public static void main(String[] args) {
        System.out.println("The main thread is starting");
        RunnableThread2 r1 = new RunnableThread2();
        //这三个线程都是通过r1这个对象来创建的，因此三个线程共享r1内的成员变量sleepTime
        Thread t1 = new Thread(r1, "Thread 1");
        Thread t2 = new Thread(r1, "Thread 2");
        Thread t3 = new Thread(r1, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("The main thread is ending");
    }
}

```



![image-20250629141158069](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629141158069.png)

可以发现这三个线程的sleepTime是一样的





* 使用同一个对象创建的多个线程内部的数据是共享的，这样就可以创建出多组线程，同组线程内部数据共享，不同组线程内部数据独立（比如说卖票，每种票的总数是固定的，那么我们可以创建出多个实现了Runnable接口的类对象，每个对象对应一种票，里面规定了票数，再用对象创建出多个线程来卖票）

* 多个线程共用同一个 Runnable 对象时，它们共享该对象的成员变量；多个线程使用不同对象时，则各自拥有独立的资源。这种设计允许我们按需构造“线程组”，实现资源共享与隔离的灵活切换，是多线程资源管理的基本模式
* 当存在共享资源的时候可能会出现线程安全的问题，比如说：`if (tickets > 0) {
      --tickets;
  }`当两个线程同时进行判断的时候，均有target == 1,于是两个线程都将最后一张票卖了出去，出现线程安全问题
* 可以使用锁来协调多个线程对共享资源的操控，之后会详细介绍

```java
class TicketsTask implements Runnable {
    //剩余票数
    private int ticketsNum;
    //票名
    private final String ticketsName;
    //锁对象
    private final Object lock = new Object();
    boolean haveTickets = true;
    public TicketsTask (int ticketsNum, String ticketsName) {
        this.ticketsNum = ticketsNum;
        this.ticketsName = ticketsName;
    }
    @Override
    public void run() {
        while (true) {
            /*
             每一个 TicketTask 对象都有一个独立的锁对象 lock。
			当多个线程共享同一个 TicketTask 对象时，它们会竞争这同一把锁。
			只有抢到锁的线程（线程A）才能进入 synchronized(lock) 中的临界区代码。
			其他线程（线程B、线程C等）必须等待线程A执行完并释放锁，才能继续。
		   */
            //当然，这里任意一个实例对象都可以，只是要让进程去竞争同一个对象的锁，从而实现互斥控制
            synchronized (lock) {
                if (ticketsNum <= 0) {
                    if(haveTickets) {
                        haveTickets = false;
                        System.out.println(ticketsName + "已经售罄");
                    }
                    break;
                }
                ticketsNum--;
                System.out.println(Thread.currentThread().getName() + "卖出了一张" + ticketsName+ "，剩余票数： " + ticketsNum);

            }
            //用来模拟购票时间
            try {
                Thread.sleep((int)(1000*Math.random()));
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}


public class SaleTickets {
    public static void main(String[] args) {
        //每个TicketsTask类对象都对应一种票的销售
        TicketsTask t1 = new TicketsTask(10, "A票");
        TicketsTask t2 = new TicketsTask(10, "B票");
        TicketsTask t3 = new TicketsTask(10, "C票");
        //每个对象可以创建多个线程，代表使用多个窗口来销售同一种票
        Thread thread11 = new Thread(t1, "A票窗口1");
        Thread thread12 = new Thread(t1, "A票窗口2");
        Thread thread13 = new Thread(t1, "A票窗口3");
        Thread thread21 = new Thread(t2, "B票窗口1");
        Thread thread22 = new Thread(t2, "B票窗口2");
        Thread thread23 = new Thread(t2, "B票窗口3");
        Thread thread31 = new Thread(t3, "C票窗口1");
        Thread thread32 = new Thread(t3, "C票窗口2");
        Thread thread33 = new Thread(t3, "C票窗口3");
        thread11.start();
        thread12.start();
        thread13.start();
        thread21.start();
        thread22.start();
        thread23.start();
        thread31.start();
        thread32.start();
        thread33.start();

    }
}
```

![image-20250629145301676](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629145301676.png)

## 线程（2）

![image-20250629145810709](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250629145810709.png)

### 多线程的同步控制

* 有时候线程之间并不独立，需要同步
  * 线程同步：在多个线程并发执行的时候，保证他们按照一定的次序执行来避免发生错误
    
  * 生产者和消费者问题
    * 生产者负责取出数据放入缓存区
    
    * 消费者从缓存区取出数据
    
    * 如果不对生产者线程和消费者线程加以同步，则会出现错误情况：缓存区满了，生产者还在放入；缓冲区空了，消费者还在取出；共享数据（缓存区）要保证每次只能有一个线程访问
    
    * 这里就需要进行线程同步，保证两个线程之间的协调
    
    * ```java
      /* synchronized关键字：用于修饰代码块，被修饰的代码块被称为同步语句块
         同一时间，同一个对象中的同步语句块只能有一个线程在执行
         wait():当前进程停止运行，并且释放对象锁，进入等待池，等待被唤醒（注意，当这个线程再一次获取锁之后会从wait()处继续执行）
         notify():唤醒等待池（当前对象的）中的某个进程，注意此时进程会进入锁竞争队列而不是直接得到锁
      */
      /*
          设计思路：设计一个buffer类，用于表示产品的缓冲区，里面维护一个队列，队列中存放产品
          （可以将一个buffer类对象看成一个仓库，线程就是负责装货和取货的工人，
          同一时间只能有一个工人有钥匙进入，如果这个工人无法取货/装货，则把钥匙给另一个工人）
          提供生产方法和消费方法，这两个方法都是同步方法，从而保证同一个缓冲区对象只能有一个线程进行操作
          生产方法中：1.判断当前缓冲区是否已满，如果已满则让当前线程等待，
          这时候对象锁会释放，消费线程获取对象锁，开始取出产品，取出产品后消费线程会唤醒生产线程
          2.如果缓冲区未满，则将产品放入缓冲区，并通知消费线程可以开始消费
          消费方法也类似
       */
      
      import java.util.LinkedList;
      import java.util.Queue;
      
      class Buffer {
          private final Queue<Integer> queue;
          private final int MAX_SIZE;
          Buffer(int size) {
              MAX_SIZE = size;
              queue = new LinkedList<>();
          }
          public synchronized void produce(int value) {
              while (queue.size() >= MAX_SIZE) {
                  System.out.println("缓冲区已满，请等待消费");
                  try{
                      wait();
                  }
                  catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
              queue.offer(value);
              notify();
              System.out.println("生产者生产了：" + value);
      
      
          }
          public synchronized void consume() {
              while (queue.isEmpty()) {
                  System.out.println("缓冲区为空，等待生产");
                  try {
                      wait();
                  }
                  catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
              int value = queue.poll();
              notify();
              System.out.println("消费者消费了：" + value);
          }
      }
      class producer implements Runnable {
          private Buffer buffer;
          public producer(Buffer buffer) {
              this.buffer = buffer;
          }
          @Override
          public void run() {
              try {
                  for(int i = 0; i < 20; i++) {
                      buffer.produce(i);
                      Thread.sleep((int)(1000*Math.random()));
                  }
              }
              catch(Exception e) {
                  e.printStackTrace();
              }
          }
      
      }
      class consumer implements Runnable {
          private Buffer buffer;
          public consumer(Buffer buffer) {
              this.buffer = buffer;
          }
          @Override
          public void run() {
              try {
                  for(int i = 0; i < 20; i++) {
                      buffer.consume();
                      Thread.sleep((int)(1000*Math.random()));
                  }
              }
              catch(Exception e) {
                  e.printStackTrace();
              }
          }
      }
      
      public class Test {
          public static void main(String[] args) {
              Buffer buffer = new Buffer(3);
              Runnable produce = new producer(buffer);
              Runnable consume = new consumer(buffer);
              Thread t1 = new Thread(produce, "Producer");
              Thread t2 = new Thread(consume, "Consumer");
              t1.start();
              t2.start();
          }
      
      
      }
      ```

线程同步的两种关系：

1. 互斥：
   * 同时运行的数据可能需要共享一些数据
   * 这些共享的数据在某个时刻只允许一个线程对此进行操作，这就是线程之间的互斥。因此有一些方法或代码块同一时间只允许一个线程执行，称为监视区
   * 只要有多个线程需要访问共享数据，并且至少有一个线程存在对共享数据的修改操作就必须保证同一时间只能由一个线程进行共享数据区的访问（加锁）
   * 因为对数据的修改不是原子操作，比如说共享数据区内有两个变量，一个线程只修改了一个变量就有另一个线程来读取变量，这样这个线程就会读取到错误的数据
2. 协作：
   * 多个线程可以有条件地共同操作共享数据区，执行监视去区的线程可以在条件满足的情况下允许其他线程进入监视区

实现互斥关系：synchronized关键字

`synchronized(obj){代码段}`

首先判断对象obj的锁是否存在，如果存在，则获得锁并且执行区域中的代码段；如果锁不存在（已经被其他对象获取），则进入对象obj的线程池进行等待，知道获得锁才继续执行之后的代码段

实际上是让{}括起来的区域的代码成为一个原子操作，即一个线程开始执行这个操作就不会有其他的线程来打断

这里的obj可以任取，只要让线程去争夺这个对象的锁即可，又是会特意设置一个锁对象用来进行线程的同步

也可以在方法前面加上synchronized关键字，让方法称为同步方法

实例同步方法：同一个对象中的所有同步方法都共用同一把锁

静态同步方法：同一个类的所有静态同步方法共用同一把锁

* 线程休眠时不会释放它所持有的锁
* 一个线程可以持有多个锁
* 同步会损害并发性，应该尽可能地减少同步的范围



### 线程的等待和唤醒

等待：wait()方法

唤醒：notify()和notifyAll()方法

注意这些方法都要在某个对象的监视区内使用
