
//Метод charAt() – возвращает символ, расположенный по указанному индексу строки.
// Индексы строк в Java начинаются с нуля.

public class Task01 {
    public static void main(String[] args) {
        String s = "99 way to die";
        char result1 = s.charAt(1);
        char result2 = s.charAt(7);
        System.out.println("Второй символ строки - " + result1);
        System.out.println("Седьмой символ строки - " + result2);

//Метод compareTo() в Java структурирован двумя вариантами.
// Первый: метод сравнивает строку с другим объектом, а второй: метод лексически сравнивает две строки.
        String str1 = "99 way to die !!!!!!!!!!!";
        String str2 = "Life is life";
        String str3 = "99 way to die !!!!!!!!!!!";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);

        Integer x = 5;
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

//Метод compareToIgnoreCase() – в Java сравнивает лексически две строки, игнорируя регистр букв.
        String stri1 = "Я буду хорошим программистом!";
        String stri2 = "Я Буду Хорошим Программистом!";
        String stri3 = "Я буду хорошим дворником!";

        int result3 = stri1.compareToIgnoreCase(stri2);
        System.out.println(result3);

        result3 = stri2.compareToIgnoreCase(stri3);
        System.out.println(result3);

        result3 = stri3.compareToIgnoreCase(stri1);
        System.out.println(result3);

//Метод concat() – возвращает строку со значением строки, переданной в метод и приложенной к концу строки,
// используемой для вызова этого метода. Проще говоря метод concat() в Java объединяет строки,
// путем добавления одной строки в конец к другой.

        String s1 = "MetallicA";
        s1 = s1.concat(" Kill'em All ");

        System.out.println(s1);


//Метод contentEquals() – возвращает значение true только в том случае,
// если эта строка представляет собой ту же последовательность символов, которая указана в строке буфера (StringBuffer).
        String str10 = "Добро пожаловать на ProgLang.su";
        String str20 = "Сайт для изучения программирования";
        StringBuffer str30 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str40 = new StringBuffer("Добро пожаловать");

        boolean  result4 = str10.contentEquals(str30);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result4);

        result4 = str20.contentEquals(str30);
        System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result4);

        result4 = str10.contentEquals(str40);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result4);

//Метод copyValueOf() в Java имеет две различные формы:
//
//public static String copyValueOf(char[] data) – возвращает строку, которая представляет собой последовательность символов в заданном массиве.
//public static String copyValueOf(char[] data, int offset, int count) – возвращает строку, которая представляет собой последовательность символов в заданном массиве.

        char[] Star1 = {'к', 'у', 'л', 'и', 'б', 'и', 'н', ' ', 'м', 'о', 'л', 'о', 'д', 'е', 'ц'};
        String Star2 = "";

        Star2 = Star2.copyValueOf(Star1);
        System.out.println("Возвращаемая строка: " + Star2);

        Star2 = Star2.copyValueOf(Star1, 2, 6);
        System.out.println("Возвращаемая строка: " + Star2);

//Метод endsWith() – проверяет, заканчивается ли эта строка указанным окончанием.
        String Str = new String("Добро пожаловать на ProgLang.su");
        boolean retVal;

        retVal = Str.endsWith(".su");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = Str.endsWith("ProgLang");
        System.out.println("Возвращаемое значение: " + retVal);

//Метод equalsIgnoreCase() – сравнивает данную строку с другой строкой, игнорируя регистр.
// Две строки считаются равными, если они имеют одинаковую длину и соответствующие
// символы у двух строк равны, игнорируя регистр букв.

        String Stir1 = "Добро пожаловать на ProgLang.su";
        String Stir2 = Stir1;
        String Stir3 = new String("Сайт для изучения программирования");
        String Stir4 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");
        boolean retiVal;

        retiVal = Stir1.equalsIgnoreCase(Stir2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retiVal );

        retiVal = Stir1.equalsIgnoreCase(Stir3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retiVal );

        retiVal = Stir1.equalsIgnoreCase(Stir4);
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retiVal );

//Метод intern() – возвращает каноническое представление для строкового объекта.
// Отсюда следует, что для любых двух строк s и t, s.intern() == t.intern(), истинно тогда и только тогда,
// когда s.equals(t) имеет значение true.

        String Str1 = new String("Добро пожаловать на ProgLang.su");
        String Str2 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");

        System.out.print("Каноническое представление Str1: " );
        System.out.println(Str1.intern());

        System.out.print("Каноническое представление Str2: " );
        System.out.println(Str2.intern());

//Метод length() – возвращает длину строки в Java. Длина равна числу 16-разрядных символов Юникода в строке.
        String Styr1 = new String("Добро пожаловать на ProgLang.su");
        String Styr2 = new String("ProgLang.su" );

        System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\" - " );
        System.out.println(Styr1.length());

        System.out.print("Длина строки \"ProgLang.su\" - " );
        System.out.println(Styr2.length());


//Метод substring() в Java имеет два варианта и возвращает новую строку, которая является подстрокой данной строки.
// Подстрока начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1,
// если введен второй аргумент.

        String Stqr = new String("  Зачем Герасим утопил Му-му?  ");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Stqr.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Stqr.substring(5, 15));

//Метод toCharArray() – в Java преобразует данную строку в новый массив символов.

        System.out.print("Возвращаемое значение: ");
        System.out.println(Stqr.toCharArray());

//Метод trim() – возвращает копию строки с пропущенными начальными и конечными пробелами,
// другими словами метод позволяет в Java удалить пробелы в начале и конце строки.
        System.out.print("Возвращаемое значение: ");
        System.out.println(Stqr.trim());



    }
}
