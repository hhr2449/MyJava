import java.io.FileNotFoundException;
import java.io.FileReader;

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
