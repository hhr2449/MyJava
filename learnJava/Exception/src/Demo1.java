import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("");
            int b;
            while((b=fis.read())!=-1) {
                System.out.print((char)b);
            }
            fis.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println("message" + e.getMessage());
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("IO Exception");
            System.out.println("message" + e.getMessage());
        }
    }
}
