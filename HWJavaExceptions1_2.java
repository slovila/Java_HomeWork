import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HWJavaExceptions1_2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }


    }
    public static void readFile() throws FileNotFoundException {
        File file = new File("rrs");
        Scanner scanner = new Scanner(file);
    }
}
