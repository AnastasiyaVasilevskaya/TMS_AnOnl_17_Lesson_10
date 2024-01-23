package task_1;

//    Номер документа имеет формат хххх-ууу-хххх-ууу-хуху, где x — это число, а у — это буква.
//    - Вывести на экран в одну строку два первых блока по 4 цифры.
//    - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//    - Вывести на экран только одни буквы из номера документа в формате ууу/ууу/у/у в нижнем регистре.
//    - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
//    (реализовать с помощью класса String Builder).
public class DocumentNumberFormat {
    public static void printTwoNumbersBlock(String str) {
        System.out.println(str.substring(0, 4) + " " + str.substring(9, 13));
    }

    public static void hideBlockOfLetters(String str) {
        System.out.println(str.replaceAll("\\p{L}{3}", "***"));
    }

}
