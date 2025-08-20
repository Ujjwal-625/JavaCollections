package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1Demo {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6);

                                                //predicate
        System.out.println(ls.stream().filter(x->x%2==0).count());
        //gives the count of elements which follow the condition provided

        //creating Streams
        //1
        Stream<Integer> s1=ls.stream();
        //2
        Stream<Integer> s2=Stream.of(1,2,3,4,5,6);
        //3 From array
        Integer [] arr={1,2,3,4,5};
        Stream<Integer> s3=Arrays.stream(arr);

        //4 Infinite Stream
        Stream<Integer> s4=Stream.generate(()->1);//creates an infinite Stream with all elements as 1
        Stream<Integer> s5=Stream.generate(()->10).limit(10);//create a stream of 10
        Stream<Integer> s6=Stream.iterate(10,a->a*2).limit(10);

        //convert Stream to list
        List<Integer> list=s6.collect(Collectors.toList());
        System.out.println(list);
    }
}
