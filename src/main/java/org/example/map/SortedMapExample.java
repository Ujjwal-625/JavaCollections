package org.example.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        //to sort in decending order
        SortedMap<String,Integer> mp=new TreeMap<>((a,b)->b.compareTo(a));
        mp.put("dias",4);
        mp.put("stones",5);
        mp.put("ake",6);
        mp.put("gondogon",19);
        mp.put("nico",14);
        System.out.println(mp);

        System.out.println(mp.firstKey());
        System.out.println(mp.lastKey());
        System.out.println(mp.headMap("nico"));
        System.out.println(mp.tailMap("dias"));
        //System.out.println(mp.subMap("dias","nico"));
    }
}
