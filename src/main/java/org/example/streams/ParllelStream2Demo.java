package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ParllelStream2Demo {
    public static void main(String[] args) {
        //here we will try to perform cumulative sum

        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        AtomicInteger sum=new AtomicInteger(0);
        // run below one at a time to see the diffrence
        //System.out.println(ls.parallelStream().map(sum::addAndGet).toList());
        System.out.println(ls.stream().map(sum::addAndGet).toList());
    }
}
