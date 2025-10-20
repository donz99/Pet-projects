package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Scanner scanner = new Scanner(System.in);



//        File fil1=new File(scanner.nextLine());

//        BufferedReader

        FileInputStream fis = new FileInputStream(scanner.next());
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader buffer = new BufferedReader(isr);
        System.out.println(buffer.readLine());
        while (buffer.ready()){
//            char c = (char) buffer.read();
            System.out.println(buffer.readLine());
        }
//            System.out.println(buffer.readLine());
//        System.out.println(fis);
//        BufferedInputStream buffer = new BufferedInputStream(fis);
//        while (buffer()>0){

//        }
//        System.out.println(fis);

        fis.close();
        buffer.close();
    }
}