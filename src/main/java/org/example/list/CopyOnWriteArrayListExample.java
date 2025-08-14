package org.example.list;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {

        // using Arraylist to read and write simoteneously
        ArrayList<String> list=new ArrayList<>();
        list.add("milk");
        list.add("bread");
        list.add("egg");
        System.out.println("Shopping List : "+list);

        //this will raise Exception since
//        we updated the list will reading it
//        for(String i:list){
//            System.out.println(i);
//            if(i.equals("egg")){
//                list.add("oil");
//                System.out.println("oil added");
//            }
//        }

        //using CopyOnArraylist
        CopyOnWriteArrayList<String> list1=new CopyOnWriteArrayList<>();
        list1.add("milk");
        list1.add("bread");
        list1.add("egg");

        //this will not throw exception
        for(String i:list1){
            System.out.println(i);
            if(i.equals("egg")){
                list1.add("oil");
                System.out.println("oil added");
            }
        }
        System.out.println(list1);
    }
}
