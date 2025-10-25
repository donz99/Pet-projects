package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put(1.1,"sdssd");
        labels.put(1.2,"sds22d");
        labels.put(1.3,"sdsssd");
        labels.put(1.5,"sd11sd");
        labels.put(1.7,"sdssdsd");
    }
}
