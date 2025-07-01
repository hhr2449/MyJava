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
                        ||name.equals(dir.getName())) {
                    result = true;
                }
                return result;
            }
        });
    }
}
