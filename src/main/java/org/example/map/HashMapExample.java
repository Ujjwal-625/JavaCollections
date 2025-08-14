package org.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        float loadfactor=(float) 0.7;Map<String ,Integer> mp=new HashMap<>(20,loadfactor);
        mp.put("a",10);
        mp.put("b",20);
        mp.put("c",50);
        mp.put("d",40);

        System.out.println(mp.get("b"));
        if(mp.containsKey("z")){
            System.out.println("map has z as a Key and its value is:"+mp.get("z"));
        }
        else{
            System.out.println("map does not contain z as a key");
        }

        Set<String> keyset=mp.keySet();
        for(String k:keyset){
            System.out.println("key : "+k+" value : "+mp.get(k));
        }

        Set<Map.Entry<String,Integer> > entrySet=mp.entrySet();

        for(Map.Entry<String,Integer> entry: entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
