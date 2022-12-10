import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HWJavaExceptions1_1 {
    public static void main(String[] args) {
        File file = new File("rtg");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
