package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        double x1=Double.parseDouble(string);
        int result=(int)Math.round(x1);
        System.out.println(result);
    }
}
