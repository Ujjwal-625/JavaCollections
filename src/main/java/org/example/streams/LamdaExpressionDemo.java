package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        Predicate<Integer> y=z->z==10;
        System.out.println(x.test(10));
        System.out.println(x.test(11));
        System.out.println(x.and(y).test(10));

        //Function is also a functional Interface
                //Element,Return
        Function<Integer,String> s=a->Integer.toString(a);
        System.out.println((s.apply(10)));

        Function<Integer,Integer> doubleIt=q->2*q;
        Function<Integer,Integer> tripleIt=q->3*q;

        System.out.println(doubleIt.apply(10));
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.andThen(tripleIt).andThen(doubleIt).apply(10));


        //combined example of all functional Interface

        Predicate<Integer> p=(a)->a%2==0;
        Function<Integer,Integer> f=(a)->a*a;
        Consumer<Integer> c=(a)-> System.out.println("Consumer has consumed : "+a);
        Supplier<Integer> sup=()->100;

        if(p.test(sup.get())){
            c.accept(f.apply(sup.get()));
        }


        //Method Reffrence
        List<String> manCity= Arrays.asList("haaland","foden","cherki","marmoush","dias","stones","gvardiol","ake","akanji","doku","rodri");
        manCity.forEach(a-> System.out.println(a));
        //instead of this lamda expression we can also use method reffrence
        manCity.forEach(System.out::println);
        //here println method will be called for every element of the manCity`
    }
}
