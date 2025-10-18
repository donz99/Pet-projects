package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        int[] a;
        Scanner sc = new Scanner(System.in);
        int numberN = sc.nextInt();
        if (numberN>0) {
            a = new int[numberN];
            for (int i = 0; i < numberN; i++) {
                int numberA = sc.nextInt();
                a[i] = numberA;
            }
            if (numberN%2==0) {
                for (int i = a.length-1; i >= 0; i--) {
                    System.out.println(a[i]);
                }
            }
            else
            {
                for (int j = 0; j < a.length; j++) {
                    System.out.println(a[j]);

                }
            }
        }



        //напишите тут ваш код
    }
}
