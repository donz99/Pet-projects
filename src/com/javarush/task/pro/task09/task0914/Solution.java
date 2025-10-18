package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index1=path.indexOf("jdk");
        String s1=path.substring(0,index1);
        int index2=path.indexOf("/",index1);
        String s2=path.substring(index2);
        //напишите тут ваш код
        return s1+jdk+s2;
    }
}
