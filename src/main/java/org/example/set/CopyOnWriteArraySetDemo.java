package org.example.set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer> set1=new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> set2=new ConcurrentSkipListSet<>();

        for(int i=1;i<=5;i++){
            set1.add(i);
            set2.add(i);
        }

        System.out.println("copyOnWriteArraySet : "+set1);
        System.out.println("ConcurrentSkipListSet : "+set2+"\n");

        System.out.println("iterating and modifying CopyOnWriteArraySet");

        for(int i: set1){
            System.out.println("Reading Set : "+i);
            //System.out.println("Writting in set ");
            set1.add(10);
        }
        //here above 10 will not be printed in this loop because initial image captured of set1
        //does not have 10 thats why it will not be printed

        System.out.println("iterating and modifying CopyOnWriteArraySet");

        for(int i: set2){
            System.out.println("Reading Set : "+i);
            //System.out.println("Writting in set ");
            set2.add(10);
        }
        //it can either display or not it is inconsistent



    }
}
