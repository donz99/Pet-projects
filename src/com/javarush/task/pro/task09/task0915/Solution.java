package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        //напишите тут ваш код
        StringTokenizer s1= new StringTokenizer(query,delimiter);

        String[] s2=new String[s1.countTokens()];
        int i=0;
        while (s1.hasMoreTokens())
        {
            String token =s1.nextToken();
            s2[i]=token;
            i++;
;        }
        return s2;
    }
}
