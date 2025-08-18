package org.example.streams;

//functionalInterface
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
    }
}
