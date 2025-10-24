package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int result=0;
        if (x>y)
            min=y;
        else min=x;
        while (true){
            if (x%min==0&&y%min==0){
                result=min;
                break;
            }
            else min--;
        }
        System.out.println(result);

    }
}
