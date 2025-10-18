package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        String[] m1;
        m1 = new String[array.length];
        int k=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                m1[k]=array[i];
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i]=m1[i];
        }
    }
}
