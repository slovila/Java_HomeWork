import java.util.Scanner;

public class HWJavaEcxeption2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valid;
        Float myNumber = null;
        String inputData;
        do {
            System.out.print("Enter Input Number: \t");
            try {
                inputData = scanner.nextLine();
                if (Float.parseFloat(inputData) > 0) {
                    myNumber = Float.parseFloat(inputData);
                    valid = true;
                } else {
                    System.out.println("Invalid Input!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        } while (!valid);
        System.out.println("You have entered: " + myNumber);
    }
}
