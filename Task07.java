import java.util.HashSet;

public class Task07 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        HashSet<Integer> myHashSet1 = new HashSet<>();
        array1 = fillArray(array1);
        myHashSet1 = fillHashSet(array1, myHashSet1);
        uniqueElements(array1, myHashSet1);


    }

    public static int[] fillArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 25));
             System.out.print(arr[i]);

        }
        System.out.println();
        return arr;
    }


    public static HashSet<Integer> fillHashSet(int[] arr , HashSet<Integer> myHashSet) {
        for (int i : arr) {
            myHashSet.add(i);
        }
        System.out.println(myHashSet);
        return myHashSet;

    }
    public static void uniqueElements(int[] arr, HashSet<Integer> list){
        double percent;
        percent = (list.size()* 100 / arr.length);
        System.out.println(percent);

    }
}
