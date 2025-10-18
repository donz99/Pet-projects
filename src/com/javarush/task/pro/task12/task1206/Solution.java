package com.javarush.task.pro.task12.task1206;

/* 
Анализ строк
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишите тут ваш код
        int digits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                digits++;

        }
        return digits;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int letter = 0;
        for (int i = 0; i < string.length(); i++) {
//            System.out.println(string.codePointAt(i));
            if ((string.charAt(i) >= 65 && string.charAt(i) <= 90)
                    ||(string.charAt(i) >= 97 && string.charAt(i) <= 122)
                    ||(string.charAt(i) >= 1040 && string.charAt(i) <= 1103)
                    ||(string.charAt(i) == 1025)
                    ||(string.charAt(i) >= 1105))
                letter++;
        }
        return letter;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int spaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 32)
                spaces++;
        }
        return spaces;

    }
}
