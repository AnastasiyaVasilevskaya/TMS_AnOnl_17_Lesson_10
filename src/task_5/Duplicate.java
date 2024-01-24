package task_5;

//    5. Вывести на консоль новую строку, которой задублирована каждая буква из начальной строки.
//    Например, "Hello" -> "HHeelllloo"

public class Duplicate {
    public static void doubleLetters(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.append(str.charAt(i)).append(str.charAt(i));
            } else result.append(str.charAt(i));
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String stroka = "Hello, mandarin 123!";
        doubleLetters(stroka);

    }
}
