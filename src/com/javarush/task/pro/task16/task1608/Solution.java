package com.javarush.task.pro.task16.task1608;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/* 
Просто день недели
*/

public class Solution {

    static LocalDate birthDate = LocalDate.of(1993, 7, 3);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //напишите тут ваш код
        var dw = date.getDayOfWeek();
        return dw.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
    }
}
