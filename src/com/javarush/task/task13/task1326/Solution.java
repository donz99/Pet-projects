package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileIn = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileIn)));
            List<Integer> arrayList = new ArrayList<>();
            while (br.ready()){
                int i=Integer.parseInt(br.readLine());
                if (i%2==0&&i!=0)
                    arrayList.add(i);
            }
            Collections.sort(arrayList);
            for (Integer i:arrayList){
                System.out.println(i);
            }
            br.close();
            sc.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


    }
}
