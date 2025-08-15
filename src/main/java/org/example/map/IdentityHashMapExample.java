package org.example.map;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap<String,Integer> mp=new IdentityHashMap<>();
        String key1=new String("foden");
        String key2=new String("foden");
        mp.put(key1,1);
        mp.put(key2,2);
        System.out.println(mp);
        //in identity map hashcode() method of Object class is used
        // and if hashcode is same then instead of using equals() method it uses == operator
        //to equate memory address of objects
    }
}
