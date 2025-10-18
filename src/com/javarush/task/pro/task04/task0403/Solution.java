package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        String name;
        while (!(name = sc.nextLine()).equals("ENTER"))
        {
            int n = Integer.parseInt(name);
            sum+=n;
        }
        System.out.println(sum);
        
        //напишите тут ваш код

    }
}