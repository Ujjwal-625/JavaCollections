package org.example.streams;

import java.util.List;
import java.util.stream.Stream;

public class ParellelStream {
    public static void main(String[] args) {
        //using simple Stream
//        long startTime=System.currentTimeMillis();
//        Stream<Integer> integers=Stream.iterate(1,a->a+1).limit(20000);
//        List<Long> factorials=integers.map(ParellelStream::factorial).toList();
//        long endTime=System.currentTimeMillis();
//        System.out.println("Total Time taken : "+(endTime-startTime)+" ms ");

//        using Parellel Stream

        long startTime=System.currentTimeMillis();
        List<Integer> integers=Stream.iterate(1,a->a+1).limit(20000).toList();
//      List<Long> factorials=integers.parallelStream().map(ParellelStream::factorial).sequential().toList();

        List<Long> factorials=integers.parallelStream().map(ParellelStream::factorial).toList();
        long endTime=System.currentTimeMillis();
        System.out.println("Total Time taken : "+(endTime-startTime)+" ms ");
    }

    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
