package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Pattern pDouble = Pattern.compile("^-?\\d+\\.\\d+$");
        Pattern pInteger = Pattern.compile("^-?\\d+$");
//        Pattern pString = Pattern.compile("^[a-zA-Z]+$");






        while (true){
            String str = reader.readLine();
//            for (int i = 0; i < str.length(); i++) {
//                str.charAt(i);
//            }
//            str.charAt();
            if (str.equals("exit"))
                break;
            else if (pDouble.matcher(str).find())
                print(Double.parseDouble(str));
            else if (pInteger.matcher(str).find()) {
                if (Integer.parseInt(str) <= 0 || Integer.parseInt(str) >= 128)
                    print(Integer.parseInt(str));
                else if (Integer.parseInt(str) > 0 && Integer.parseInt(str) < 128)
                    print(Short.parseShort(str));

            }
            else
                print(str);
        }
        reader.close();
    }

//    public static boolean isNumber(String str){
//        return (str.matches("-?\\d+")||str.matches("-?\\d\\.\\d")) ? true : false;
//    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
