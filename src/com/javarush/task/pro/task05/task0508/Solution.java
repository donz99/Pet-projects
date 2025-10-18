package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc=new Scanner(System.in);
        strings=new String[6];
//        String max="";
        for (int i = 0; i < strings.length; i++) {
            String s =sc.nextLine();
            strings[i]=s;
        }
//        for (int i = 0; i < strings.length ; i++) {
//
//            for (int j = 1+i; j < strings.length ; j++) {
//                int k=0;
//                if (strings[i].equals(strings[j])) {
//                    strings[j]=max;
//                    k++;
//                }
//                if (k>0)
//                    strings[i]=max;
//            }
//
//        }
//        for (int i = 0; i < strings.length; i++) {
//            if (strings[i].equals(max))
//                strings[i]=null;
//        }



        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
