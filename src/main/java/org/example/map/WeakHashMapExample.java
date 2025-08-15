package org.example.map;

import java.util.WeakHashMap;

class Image{
    String name;

    @Override
    public String toString() {
        return name;
    }

    public Image(String name) {
        this.name = name;
    }
}

public class WeakHashMapExample {

    public static void waitForFiveSec(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        //key as String literal
        //String litral are Strongly reffered

        WeakHashMap<String,Image> weakHashMap=new WeakHashMap<>();
        weakHashMap.put("foden",new Image("foden"));
        weakHashMap.put("haaland",new Image("haaland"));
        System.out.println(weakHashMap);
        System.gc();
        waitForFiveSec();
        System.out.println(weakHashMap);//since keys are strongly reffered so no entry will be removed


        //creating keys as String Object
        WeakHashMap<String ,Image> weakHashMap1=new WeakHashMap<>();
        weakHashMap1.put(new String("foden"),new Image("foden"));
        weakHashMap1.put(new String("haaland"),new Image("haaland"));
        System.out.println(weakHashMap1);
        System.gc();
        waitForFiveSec();
        System.out.println(weakHashMap1);//now the map will be empty because String object keys
        // have weak refferece and the will be garbage collected by JVM and since key is removed
        //so entry coresponding to the key will also be removed


    }
}
