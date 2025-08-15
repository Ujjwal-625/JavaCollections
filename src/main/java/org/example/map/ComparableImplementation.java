package org.example.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableImplementation implements Comparable<ComparableImplementation> {
    String name;
    int age;
    int id;

    public ComparableImplementation(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //same logic as compare method of Comprator
    @Override
    public int compareTo(ComparableImplementation o) {
        return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Player : "+name+" Age : "+age +" Jersey No. : "+id+"\n";
    }

    public static void main(String[] args) {
        List<ComparableImplementation> list=new ArrayList<>();
        list.add(new ComparableImplementation("foden",25,47));
        list.add(new ComparableImplementation("haaland",25,9));
        list.add(new ComparableImplementation("marmoush",26,7));
        list.add(new ComparableImplementation("doku",22,11));
        list.add(new ComparableImplementation("gvardiol",23,24));

        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
