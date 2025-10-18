package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Denis Krasko", 4.3);
        grades.put("Vadim Boreiko", 4.1);
        grades.put("Klava Sister", 4.2);
        grades.put("Dima Ovechka", 3.1);
        grades.put("Alesha Popovich", 2.3);
    }
}
