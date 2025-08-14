package org.example.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache<K,V> extends LinkedHashMap<K,V> {
    int capacity;

    public LRUcache(int capacity) {
        super(capacity, 0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return capacity<size();
    }

    public static void main(String[] args) {
        LRUcache<String,Integer> cache=new LRUcache<>(3);
        cache.put("Silve",20);
        cache.put("Cherki",17);
        cache.put("Foden",47);
        cache.put("Rienders",8);
        for(Map.Entry<String,Integer> entry:cache.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        //here silva is removed as we try to put rienders
    }

}
