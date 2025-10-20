package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        Scanner sc = new Scanner(System.in);
        String textTXT=sc.nextLine();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(textTXT));

            while (true){
                String sss = sc.nextLine();
                if (sss.equals("exit")){
                    bw.write(sss);
                    break;
                }
                bw.write(sss + "\n");
//                bw.flush();
            }

            br.close();
            bw.close();


        } catch (IOException ex){
            ex.printStackTrace();
        }





//        FileWriter writer = new FileWriter(s);
//        BufferedWriter bfWriter = new BufferedWriter(writer);
//
//
//
//
//
//
//
//        while (!sss.equals("exit")){
//
//            FileInputStream fis = new FileInputStream(sss);
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader buffer = new BufferedReader(fis);
//            bfWriter.write(buffer.read());





    }
}
