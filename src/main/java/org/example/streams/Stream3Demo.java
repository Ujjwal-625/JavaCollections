package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream3Demo {
    public static void main(String[] args) {
        //terminal operations

        List<String > mancityDepartures= Arrays.asList("gundogon","kovacic","bernado","akanji","walker","grealish");

        // 1 Collect
        System.out.println(mancityDepartures.stream().collect(Collectors.toList()));
        //or
        System.out.println(mancityDepartures.stream().toList());


//        2 ForEach
        mancityDepartures.stream().forEach( a-> System.out.println(a+" will depart in this window"));

        // 3 Reduce
        Optional<String> o=mancityDepartures.stream().reduce((a, b)->a+" and "+b+" left\n");
        System.out.println(o.get());

        //count()
        // anyMatch(),noneMatch(),allMatch() they all take predicate

        System.out.println(mancityDepartures.stream().anyMatch(a->a.startsWith("g")));

        //findFirst,FindAny
        System.out.println(mancityDepartures.stream().findAny().get());
        System.out.println(mancityDepartures.stream().findFirst().get());

        List<Integer> ls=Arrays.asList(1,2,34,5,6,7,8);
        System.out.println(ls.stream().reduce(Integer::sum).get());


    }
}
