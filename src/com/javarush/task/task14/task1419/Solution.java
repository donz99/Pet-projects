package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();


    public static void main(String[] args) {

        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        exceptions.add(new IOException());
        exceptions.add(new SecurityException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new RuntimeException());
        exceptions.add(new DataFormatException());
        exceptions.add(new ArrayStoreException());
        exceptions.add(new NegativeArraySizeException());
        exceptions.add(new EmptyStackException());
        exceptions.add(new StringIndexOutOfBoundsException());

        //напишите тут ваш код

    }
}
