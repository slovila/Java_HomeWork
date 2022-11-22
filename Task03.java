import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        int[] arr1 = new int[20];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        System.out.println("Введите целочисленные значения элементов массива: ");
        for (int i = 0; i < arr1.length; i++) {
            Scanner s = new Scanner(System.in);
            arr1[i] = s.nextInt();
        }

        Arrays.sort(arr1);

        System.out.println("Вывод массива с наименьшими значениями: ");
        for (int j = 0; j < arr1.length / 2; j++) {
            arr2[j] = arr1[j];
            System.out.print(arr2[j] + ", ");

        }
        System.out.println();

        System.out.println("Вывод массива с наибольшими значениями: ");
        for (int j = 0; j < arr1.length / 2; j++) {
            arr3[j] = arr1[j + 10];
            System.out.print(arr3[j] + ", ");
        }


    }
}
