package org.example.list;

//either you have to create a class which implements comparable or use lamda expression

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CompareString implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.compareTo(s2)<0)return 1;
        return -1;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List <String> list=new ArrayList();
        list.add("banana");
        list.add("apple");
        list.add("grapes");
        list.add("papaya");
        list.add("kiwi");
        list.add("orange");
        System.out.println(list);

        list.sort(null);
        System.out.println(list);

        list.sort(new CompareString());// by creating a class and implementing Comprator
        System.out.println(list);

        list.sort(null);

        //by using lamda expression
        System.out.println(list);

        list.sort((s1,s2)->{
            if(s1.compareTo(s2)<0)return 1;
            return -1;
        });
        System.out.println(list);
    }
}
