package org.example.list;

import java.util.Arrays;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> v=new Vector<>();//initial capacity 10
        System.out.println(v.capacity());

        Vector<Integer> v1=new Vector<>(5,10);
        //initial capacity 5 if capacity is full then increamemnt capacity by 1
        System.out.println(v1.capacity());

        v1.add(1);
        v1.add(1);
        v1.add(1);
        v1.add(1);
        v1.add(1);
        System.out.println(v1.capacity());
        v1.add(1);
        System.out.println(v1.capacity());

        Vector<Integer> v2=new Vector<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(v2);

    }
}
