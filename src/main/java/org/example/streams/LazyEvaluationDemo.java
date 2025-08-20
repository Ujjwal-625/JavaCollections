package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("kudus","son","tel","sarr");
        Stream<String> spurs=ls.stream().filter((a)->{
            System.out.println("filtering "+a);//this will be printed after Before Terminal operation
            //this states that intermediate operations are lazy and won't execute until terminal operation
            return a.length()>3;
        });

        System.out.println("Before terminal operation");

        List<String> Frank=spurs.collect(Collectors.toList());

        System.out.println("After terminal operation");

        System.out.println(Frank);
    }
}
