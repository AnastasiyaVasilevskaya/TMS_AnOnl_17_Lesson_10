package task_4;

//    4. Дана строка произвольной длины с произвольными словами.
//    Написать программу для проверки является ли любое выбранное слово в строке палиндромом.
//    Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е слово в этой строке палиндромом.
//    Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций:
//    например, в строке 5 слов, а на вход программе передали число 500 и т. п. ситуации.

import java.util.Scanner;

public class Palindrome {
    public static void findPalindrome(String str, int num) {
        String[] words = str.split(" ");

        if (num <= 0 || num > words.length) {
            throw new IllegalArgumentException("Ошибка: указанная позиция не соответствует количеству слов в строке.");
        }

        String word = words[num - 1];
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println("Слово " + word.toUpperCase() + " является палиндромом");
        } else {
            System.out.println("Слово " + word.toUpperCase() + " не палиндром");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stroka = "жаба черёмуха банан аргентинаманитнегра";
        System.out.println("Вся строка: \n" + stroka);

        try {
            System.out.print("Введите число - ");
            int position = scanner.nextInt();
            findPalindrome(stroka, position);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}