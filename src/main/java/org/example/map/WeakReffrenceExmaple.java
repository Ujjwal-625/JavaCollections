package org.example.map;

import java.lang.ref.WeakReference;

class Phone{
    String name;
    String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return name+" "+model;
    }
}

public class WeakReffrenceExmaple {
    public static void main(String[] args) {
        Phone p=new Phone("IQOO","Z3");//strong reference
        System.out.println(p);
        WeakReference<Phone> weakReference=new WeakReference<>(new Phone("IQOO","Z9"));
        System.out.println(weakReference.get());
        System.gc();//sugesting jvm to run garbage collection
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(p);
        System.out.println(weakReference.get());//weak refrece is clear by garbage collector
    }

}
