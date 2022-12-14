import java.util.ArrayList;

public class Task05 {
    public static void main(String[] args) {
        /*В игре в пьяницу карточная колода раздается поровну двум игрокам. Далее они
вскрывают по одной верхней карте, и тот, чья карта старше, забирает себе обе
вскрытые карты, которые кладутся под низ его колоды. Тот, кто остается без
карт - проигрывает.
Для простоты будем считать, что все карты различны по номиналу, а также, что
самая младшая карта побеждает самую старшую карту ("шестерка берет туза").
Игрок, который забирает себе карты, сначала кладет под низ своей колоды
карту первого игрока, затем карту второго игрока (то есть карта второго игрока
оказывается внизу колоды).
Напишите программу, которая моделирует игру в пьяницу и определяет, кто
выигрывает. В игре участвует 10 карт, имеющих значения от 0 до 9, большая
карта побеждает меньшую, карта со значением 0 побеждает карту 9.
Входные данные
Программа получает на вход две строки: первая строка содержит 5 карт первого
игрока, вторая - 5 карт второго игрока. Карты перечислены сверху вниз, то есть
каждая строка начинается с той карты, которая будет открыта первой.
Выходные данные
Программа должна определить, кто выигрывает при данной раздаче, и вывести
слово first или second, после чего вывести количество ходов, сделанных до
выигрыша. Если на протяжении 106 ходов игра не заканчивается, программа
должна вывести слово botva.
Пример ввода
1 3 5 7 9
2 4 6 8 0
second 5*/

        int[] a1 = {1, 3, 5, 9, 7};
        int[] a2 = {2, 4, 6, 8, 0};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }

        int count = 0;
        boolean res = false;

        for (int i = 0; i < 106; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
            arr1.remove(0);
            arr2.remove(0);

            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}



