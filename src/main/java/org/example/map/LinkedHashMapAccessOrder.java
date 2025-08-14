package org.example.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccessOrder {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>mp=new LinkedHashMap<>(10, 0.75f,true);
        mp.put("apple",1);
        mp.put("banana",2);
        mp.put("grapes",3);

        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        mp.get("banana");
        mp.get("apple");
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
