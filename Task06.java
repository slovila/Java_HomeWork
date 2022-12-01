import java.util.ArrayList;

import java.util.TreeMap;

// Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
// Слова с одинаковой длиной не должны “потеряться”.
public class Task06 {
    public static void main(String[] args) {

        String st = "Зачем Володька сбрил усы";
        String[] arr = st.split(" ");

        TreeMap<String, Integer> resultList = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {

            resultList.put(arr[i], arr[i].length());

        }

        System.out.println(resultList.descendingMap());

        ArrayList<String> word = new ArrayList<>(resultList.descendingKeySet());
        String myWord = String.join("\t", word);
        System.out.println(st);
        System.out.println(myWord);


    }

}


