package com.hhr2449.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//处理输入
//可以利用查询参数
//http://localhost:8080/hi?name=value&name2=value2



//控制器类，可以用于处理web程序的输入输出
//加上标记@Controller成为控制器类
//@开头的成为注解
@Controller
public class HelloController {

    //@RequestMapping表示url路径和方法之间的对应关系，这里代表hi这个路径和hi方法之间对应
    //@ResponseBody用于处理方法返回结果，表示将方法返回结果作为相应内容
    @RequestMapping("/hi")
    @ResponseBody
    //传入一个与查询参数同名的方法参数，这样就可以在方法中使用查询参数
    String hi(String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping("/bye")
    @ResponseBody
    String bye() {
        return "Good Bye!";
    }

    @RequestMapping("/add")
    @ResponseBody
    int add(int a, int b) {
        return a+b;
    }

    @RequestMapping("/sub")
    @ResponseBody
    int sub(int a, int b) {
        return a-b;
    }
}
