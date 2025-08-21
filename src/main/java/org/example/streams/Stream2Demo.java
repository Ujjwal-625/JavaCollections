package org.example.streams;

import java.util.Arrays;
import java.util.Collection;
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


        //peek
        //work same as forEach but it is a intermediate operation
        System.out.println(Stream.iterate(10L,a->a*10).limit(10).peek(System.out::println).count());

        //flatMap
        List<List<String>> manCitySquad=Arrays.asList(
                Arrays.asList("phil","foden"),
                Arrays.asList("erling","haaland"),
                Arrays.asList("jack","grealish"),
                Arrays.asList("kevin","debruyne")
        );

        List<String> newManCitySquad=manCitySquad.stream().flatMap(Collection::stream).map(String::toUpperCase).toList();
        System.out.println(newManCitySquad);

        List<String> sentance=Arrays.asList(
                "hello world",
                "java streams are powerfull",
                "flatmap is very usefull"
        );

        List<String> ls=sentance.stream().flatMap(a->Arrays.stream(a.split(" "))).map(String::toUpperCase).toList();
        System.out.println(ls);



    }
}
