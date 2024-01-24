package task_2;

//    2. Дана строка произвольной длины с произвольными словами.
//    Найти самое короткое слово в строке и вывести его на экран.
//    Найти самое длинное слово в строке и вывести его на экран.
//    Если таких слов несколько, то вывести последнее из них.

public class StrLength {
    public static void shortestAndLongestWord(String str) {
        String[] words = str.split("[\\s\\p{Punct}—]+");

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() <= shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Дана строка из слов: \n" + str);
        System.out.println("Самое короткое слово - " + shortestWord);
        System.out.println("Самое длинной слово - " + longestWord);
    }


    public static void main(String[] args) {
        String message = "Я хочу зарабатывать пять тысяч долларов, я - фантазёр!";

        shortestAndLongestWord(message);
    }
}
