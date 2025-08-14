package org.example.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person{
    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj ==null)return false;
        if(getClass()!=obj.getClass())return false;
        Person other=(Person) obj;
        return (id==other.getId() && Objects.equals(name,other.getName()));//to avoid exception we used Objects
    }

    @Override
    public String toString() {
        return this.name+" " +this.id;
    }
}
public class HashMapAnomly {
    public static void main(String[] args) {
        Map<Person,Integer> mp=new HashMap<>();

        Person p1=new Person("Ujjwal",1);
        Person p2=new Person("randon",2);
        Person p3=new Person("Ujjwal",1);

        mp.put(p1,12);
        mp.put(p2,13);
        mp.put(p3,14);
        //so now there will be 3 entries in the map
        // As in case of custom classes hashcode is generated based on memory and since
        // we are using new keyword create every object so diffrent hashcode will be generated
        // so to overcome this  problem we have to override hashcode and equals method in Person class
        for(Map.Entry<Person,Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
