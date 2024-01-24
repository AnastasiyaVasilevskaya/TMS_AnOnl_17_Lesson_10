package task_5;

//    5. Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
//    Например, "Hello" -> "HHeelllloo"

public class Duplicate {
    public static void doubleLetters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        String stroka = "Hello";
        doubleLetters(stroka);

    }
}
