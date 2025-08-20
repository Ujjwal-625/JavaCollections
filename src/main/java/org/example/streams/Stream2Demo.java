package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2Demo {
    public static void main(String[] args) {
        //intermediate operations

        //1 Filter
        //this will take Predicate
        List<String> manCity= Arrays.asList("foden","ake","akanji","ait noori","ake");
        //here filter is intermediate operation
        Stream<String> newStream =manCity.stream().filter(a->a.startsWith("a"));
        System.out.println(newStream);
        System.out.println(newStream.collect(Collectors.toList()));
        //System.out.println(newStream.count());//this will raise excetion as terminal operation is already called above


        //2 Map
        //this will take Function
        //here we are using method reffrence instead of lamda exp
        System.out.println(manCity.stream().map(String::toUpperCase).collect(Collectors.toList()));

        //sorted
        //sorts according to natural ordering or you can also pass comparator

        System.out.println(manCity.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList()));

        //distict
        //returns a stream with only distinct elements
        System.out.println(manCity.stream().filter(a->a.startsWith("a")).distinct().collect(Collectors.toList()));



    }
}
