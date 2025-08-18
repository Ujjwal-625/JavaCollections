package org.example.streams;

import java.util.function.Function;
import java.util.function.Predicate;

//functionalInterface
@FunctionalInterface
interface MathOperation {
    public int operation(int a,int b);
}

public class LamdaExpressionDemo {
    public static void main(String[] args) {
        //this is functional Programming as we are treating function as a variable
        MathOperation addition=(a,b)->a+b;
        MathOperation subtraction=(a,b)->a-b;
        MathOperation multiplication=(a,b)->a*b;
        MathOperation division=(a,b)->a/b;

        System.out.println(addition.operation(10,20));
        System.out.println(subtraction.operation(10,20));
        System.out.println(multiplication.operation(10,20));
        System.out.println(division.operation(10,20));

        //Predicate is a functional Interface
        Predicate<Integer> x=y->y%2==0;
        System.out.println(x.test(10));
        System.out.println(x.test(11));

        //Function is also a functional Interface
                //Element,Return
        Function<Integer,String> s=a->Integer.toString(a);
        System.out.println((s.apply(10)));

        Function<Integer,Integer> doubleIt=q->2*q;
        Function<Integer,Integer> tripleIt=q->3*q;

        System.out.println(doubleIt.apply(10));
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.andThen(tripleIt).andThen(doubleIt).apply(10));
    }
}
