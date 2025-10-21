package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Person person = null;
//        String key = reader.readLine();

        Map <String, Person> hashMap = new HashMap<>();
        hashMap.put("user",new Person.User());
        hashMap.put("loser",new Person.Loser());
        hashMap.put("coder",new Person.Coder());
        hashMap.put("proger",new Person.Proger());


        while (true){
            String sss=reader.readLine();
            if (!hashMap.containsKey(sss))
                break;
            doWork(hashMap.get(sss));
        }

        reader.close();

        //тут цикл по чтению ключей, пункт 1
        {
            //создаем объект, пункт 2

//            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User)
            ((Person.User) person).live();
        if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
        // пункт 3
    }
}
