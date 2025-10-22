package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Movie movie=null;
        HashMap<String, Movie> hashMap = new HashMap<>();
        hashMap.put("soapOpera",new SoapOpera());
        hashMap.put("cartoon",new Cartoon());
        hashMap.put("thriller",new Thriller());
        Scanner sc = new Scanner(System.in);
        while (true){
            String sss=sc.nextLine();
            movie=
            MovieFactory.getMovie(sss);
            if (!hashMap.containsKey(sss))
                break;
            System.out.println(movie.getClass().getSimpleName());
        }
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key)){
                movie = new Cartoon();
            }
            if ("thriller".equals((key))){
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {}
    static class Thriller extends Movie {}

    //Напишите тут ваши классы, пункт 3
}
