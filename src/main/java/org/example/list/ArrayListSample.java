package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {

        //inital size of list is 0 but capacity is 10
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(1);//remove 2nd index
        System.out.println(list);
        list.add(1,2);
        System.out.println(list);

        list.remove(Integer.valueOf(1));//now first occurence of 1 will be removed

        System.out.println(list);

        System.out.println(list.size());

        List<Integer> list1=Arrays.asList(4,5,6,7,8,9,10);//returns a list of fixed size

       // list1.add(11);// this will raise exception you can't remove or add element

        list.addAll(list1);//add elements to first list

        System.out.println(list);
        System.out.println(list.size());

    }
}
