## html

超文本标记语言

作用：为网页提供结构

标签：通常成对出现，包括开始标签和结束标签

内容位于标签之间

单标签：用于没有内容的元素

* 文件结构

```html
<!--用于告诉浏览器这是一个html文件-->
<!DOCTYPE html>
<!--成对的html标签是根节点，是文档的最外层容器-->
<html>
    <!--头部用于包含文档的原信息，如标题，编码，1一些外部css文件等-->
   	<head>
    </head>
    <!--具体在界面展示的内容-->
    <body>
    </body>
</html>
```

* 标题标签

  一共有6个，从h1到h6,依此变小

* 段落标签

  以p表示

  可以更改文本样式

  <b>加粗(bold)</b>

  <i>斜体(italic)</i>

  <u>下划线(under)</u>

  <s>删除线</s>

* 无序列表和有序列表

  列表元素使用<li>包围

  无序列表外层加上一个<ul>

  有序列表外层加上一个<ol>

  <ul>
      <li>无序列表1</li>
      <li>无序列表2</li>
      <li>无序列表3</li>
  </ul>
  <ol>
      <li>有序列表1</li>
      <li>有序列表2</li>
      <li>有序列表3</li>
  </ol>
  

* 表格标签

  外层使用<table>标签

  <tr>表示表格的一行(table row)

  <td>表示行内的数据(table data)

  <th>表示列标题(table header)

  ```html
  <table border = "1">
          <tr>
              <th>列标题1</th>
              <th>列标题2</th>
              <th>列标题3</th>
          </tr>
          <tr>
              <td>元素11</td>
              <td>元素12</td>
              <td>元素13</td>
          </tr>
          <tr>
              <td>元素21</td>
              <td>元素22</td>
              <td>元素23</td>
          </tr>
          <tr>
              <td>元素31</td>
              <td>元素32</td>
              <td>元素33</td>
          </tr>
  </table>

table标签中的border元素用于指定表格边框的宽度  

* 属性：

标签中可以放属性

* a标签，用于创建超链接

  herf属性：其他网页的链接

  ```html
  <a href="https://www.baidu.com">百度</a>
  ```

​	target属性：定义链接打开方式

`<br>`:换行标签

`<hr>`分割线标签

* img标签

  用于展示图片

  src属性：图片的路径，可以是相对路径，绝对路径，URL 

  alt属性：用于定义图片的替代文本，当图片无法显示的时候显示的字符

  width属性：用于设置图片的宽度

  height属性：用于设置图片的高度

html区块

块元素：从新的一行开始，并且占据整行内容，呈现为一个独立的内容块

div标签：仅用于创建内容快，没有实际含义

行内元素：在同一行内呈现，不会占据一行

span标签：给文本的一部分使用样式或者标记

* 表单

  HTML表单用于收集用户的输入信息HTML 表单表示文档中的一个区域，此区域包含交互控件，将用户收集到的信息发送到 Web 服务器。

  HTML 表单通常包含各种输入字段、复选框、单选按钮、下拉列表等元素。

  * `<form>`标签用于创建表单区域

    action属性用于定义提交数据的URL,method属性用于定义提交数据的http方法

  * `<label>`标签用于为表单元素添加标签

  for属性：与id相关联

  * `<input>`是表单元素，用于创建输入框，单选按钮，复选框等

  1. type属性定义输入框类型

     * text:文本框

     * password:密码框

     * radio:单选(注意要把name设置为相同才有单选的效果)

     * checkbox:复选

     * submit:提交

  2. id属性:用于表示该元素的唯一id，id不能重复，一般用于和label关联或是被javascript选中

  3. name属性:指定字段名，在表单提交时作为提交的key，用于后端接受数据

  （比如设定name="username"，那么提交时数据会以username=xxx的形式发送）

  4.  value属性

     在文本框和密码框中表示默认值

     在submit中表示显示的文字

     在radio,checkbox,option中表示选中这一项实际提交的值

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>表单</title>
</head>
<body>
<h1>注册界面</h1>
<!--form用于创建表单，action是提交时表单数据发送的地址-->
<form action="#">
  <!--label标签用于创建表单的标签,for用于和元素的id绑定-->
  <label for="username">用户名</label>
  <!--input标签用于创建表单的输入框-->
  <!--name属性表示上传时的表单数据的名称-->
  <input type="text" name="username" id="username">
  <br><br>
  <label for="password" >密码</label>
  <input type="password" name="password" id="password">
  <br><br>
  <!--radio表示单选框-->
  <input type="radio" name="gender" value="male"> male
  <input type="radio" name="gender" value="female"> female
  <input type="radio" name="gender" value="other"> other
  <br><br>
  <!--checkbox表示复选框-->
  <input type="checkbox" name="hobby" value="sing"> 唱歌</input>
  <input type="checkbox" name="hobby" value="dance"> 跳舞</input>
  <input type="checkbox" name="hobby" value="rap">rap</input>
  <input type="checkbox" name="hobby" value="basketball">篮球</input>
  <br><br>
  <label for="country"></label>
  <!--创建下拉列表-->
  <select name="country" id="country">
    <option value="china">China</option>
    <option value="usa">USA</option>
    <option value="japan">Japan</option>
    <option value="korea">Korea</option>
    <option value="england">England</option>
    <option value="france">France</option>
  </select>
  <br><br>
  <input type="submit" value="提交">

</form>
</body>
</html>
```

## css

css:层叠样式表

html用于定义页面的布局和内容

css用于更精确的控制页面的外观和样式

可以指定页面中元素的颜色，样式，边框等

选择器 {
	属性1:属性值1;
	属性2:属性值2;
}	
1. 选择器的声明中可以写无数条属性
2. 声明的每一行结尾都有分号
3. 生命中的所有属性和值都是以键值对的方式出现的

* 选择器：选择需要应用样式的元素，可以选择所有元素或者是特定元素

```css
p {
    color:blue;
    front-size:16px
}
```

表示对p标签应用

导入方式：

1. 内联样式：直接在标签中设置style
2. 内部样式表：在html中的head标签中创建style标签，然后在里面写css
3. 外部样式：创建css文件，然后将其链接进来，便于复用，使用link标签进行导入
4. 优先级：内联样式>内部样式表>外部样式表，优先级高的样式会覆盖掉优先级低的样式

* 选择器

  用于规定css样式运用的html元素

  * 元素选择器：应用于所有某类的元素

    以元素类别开头

    ```css
    h2{
        color: blue;
        front-size: 18px;
        text-align: center;
    }
    ```

  * 类选择器：应用于同一个类的所有元素

    以`.类名`开头

    ```css
    .hh3 {
        color: red;
        front-size: 20px;
        text-align: center;
        text-decoration: underline;
    }
    ```

  * id选择器：应用于特定标签的元素

    以#id开头

    ```css
    #hh4 {
        color: yellow;
        front-size: 22px;
        text-align: center;
    }
    ```

  * 通用选择器：应用于全局

    以*开头

    ```css
    * {
        font-family:"楷体";
    }
    ```

  * 子元素选择器：选择直接位于父元素内部的子元素

    一个大标签嵌套一个小标签，那么大标签就是父标签
    
    ```css
    /*子元素选择器，修改子元素样式*/
    /*中间以大于号相连接，左边放父元素，右边放子元素，可以是元素名，类名，id*/
     div > .son {
        color: blue;
        font-width:bold;
    }
     #father > #son {
         color:red;
         font-width:i;
     }
    ```
    
  * 后代选择器：后代包含子代
  
      ```css
      /*子代和后代的区别：后代是包含子代的*/
      /*后代选择器*/
      /*可以发现后代选择器将之前子元素选择器表示的内容给覆盖掉了*/
      div .son {
          color: darkorange;
          font-width:bold;
      }
      
      ```
  
  * 相邻元素选择器：
  
    ```css
    /*相邻选择器，修改相邻元素样式*/
      h3 + h4 {
          color: blue;
          front-size: 18px;
          text-align: center;
          text-decoration: underline;
          text-decoration: overline;
      }
    ```
  
  * 伪类选择器：用于选择元素的位置和状态，可用于用户交互
  
    ```css
    #element:hover {
        color: red;
        front-size: 18px;
        text-align: center;
    }
    ```

* css属性

  ```css
  <!--font属性：复合属性，用于设置字体-->
  <h1 style="font: bolder 50px '华文隶书';">这是font属性的实例</h1>
  
  <!--line-height用于控制行距-->
  <!--注意font属性中有line-height的部分，如果写了font，那么单独的line-height就会被覆盖-->
  <p style=" font:bolder 20px/100px '华文仿宋';"></p>
  ```

块元素（block）：从新的一行开始，并且占据一整行的宽度，可以设置宽度，高度等

行内元素(inline)：只在同一行内呈现，只占据自己需要的宽度,无法添加宽度和高度

行内块元素(line-block)：水平方向上排列 ，但是可以设置宽度，高度，内外边距等会计元素的属性

display属性：可以实现元素类型之间的转换



* 盒子模型

  ![image-20250624103102744](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250624103102744.png)

![image-20250624103125480](https://raw.githubusercontent.com/hhr2449/pictureBed/main/img/image-20250624103125480.png)

```css
.demo {
    width: 300px;
    height: 200px;
    background:pink;
    /*使用text-align调整水平居中，使用line-height调整竖直居中*/
    text-align:center;
    line-height:200px;
    padding:50px;
    margin:50px;
    /*分别设置边框的宽度，样式，颜色*/
    border:2px dotted red;
}
.border-demo {
    width: 300px;
    height: 200px;
    background:purple;
    text-align:center;
    line-height:200px;
    padding:50px;
    margin:50px;
    /*分别设置四个边框的宽度，样式，颜色*/
    /*可以分别设置四个边框，遵循上，右，下，左的顺序*/
    border-width: 2px 5px 0px 0px;
    border-style:double;
    border-color:deepskyblue;
}
```







## javascript

用于在网页上实现动态效果，增加用户与网页的交互性

可以使网页睡着用户的操作而变化 

* 导入方式：1.内联式：直接嵌入html文件，用script标签包围

  2.外部引入：写外部的javascript文件，并且用script标签引入

  console.log():会在控制台打印

  alert:会出现弹窗

* 变量和数据类型：

  var:变量，函数作用域

  let:变量，块级作用域

  const:常量

  ```javascript
  <script>
      //控制台
      console.log("helloworld, this is an example of javascript");
      //弹窗
      alert("弹窗hhhhhhhh");
      //声明变量
      var a = 10;
      let b = 123.2331;
      //声明常量
      const pi = 3.141592653589;
      console.log(a, b, pi);
      alert(pi);
      let name = "大明王朝";
      //null代表被赋值为空值，undefined代表定义了变量但是没有初始化
      let empty = null;
      let empty2;
      console.log(name, empty, empty2);
  </script>
  ```

* 控制语句：

  与cpp类似 	

  ```js
  <script>
      let age = 18;
      if(age>= 18) {
          console.log("已成年，允许投票");
      }
      else {
          console.log("未成年，不允许投票");
      }
      let time = 12;
      if(time > 12) {
          alert("上午好");
      }
      else if(time >= 12 || time < 18){
          alert("下午好");
      }
      else {
          alert("晚上好");
      }
  
      for(let i = 0; i < 10; i++) {
          console.log(i);
          if(time > 10 && i == 4) {
              break;
          }
      }
  
  
  </script>
  ```

* 函数

  function functionName(参数1， 参数2， 参数3 ……) {

	body

	return

  }
  
  ```js
  <script>
      let age = 18;
      if(age>= 18) {
          console.log("已成年，允许投票");
      }
      else {
          console.log("未成年，不允许投票");
      }
      let time = 12;
      if(time > 12) {
          alert("上午好");
      }
      else if(time >= 12 || time < 18){
          alert("下午好");
      }
      else {
          alert("晚上好");
      }
  
      for(let i = 0; i < 10; i++) {
          console.log(i);
          if(time > 10 && i == 4) {
              break;
          }
      }
      function hello(name) {
          return "hello" + name;
      }
      alert(hello("张三百"));
  
  
  </script>
  ```

* **事件**

  | 事件        | 描述             |
  | ----------- | ---------------- |
  | onClick     | 点击事件         |
  | onMouseOver | 鼠标经过         |
  | onMouseOut  | 鼠标移开         |
  | onChange    | 文本内容改变事件 |
  | onSelect    | 文本框选中       |
  | onFocus     | 光标聚焦         |
  | onBlur      | 移开光标         |

  

事件就是一个函数触发的条件，当事件发生了，相关联的函数就会被触发

绑定事件的方法：

1. HTML属性:将事件作为标签的属性，并且将绑定的函数作为属性值
2. DOM属性
3. addEventListener方法

* DOM

  HTML文档可以被看作一颗文档书，DOM式整个文档的文档对象模型

  DOM为整棵文档书提供了一个编程接口，可以使用JavaScript来操纵这个对象模型

