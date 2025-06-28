public class TestArray {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        //这里初始化一个长度为10的数组，int[]可以看作数组类
        //可以直接初始化数组

        //使用a.length函数可以获取数组的长度
        for(int i = 0; i < a.length; i++) {
            //注意a[i]+ ' '中的空格会转换为ASCLL码，应该使用双引号
            System.out.print(a[i] + " ");
        }
        //使用for-each循环遍历数组
        for(int i : a) {
            System.out.print(i + " ");
        }

        System.out.print("\n");
        //这里直接将b引用a，b和a引用同一个数组
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
    }
}
