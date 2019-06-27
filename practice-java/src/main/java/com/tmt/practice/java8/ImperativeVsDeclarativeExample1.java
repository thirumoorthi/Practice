package com.tmt.practice.java8;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /**
         * Imperative Style - how style of programming
         */
        int sum=0;
        for(int i=0;i<=100;i++){
                sum+=i; // shared mutable state and its sequential and it will go step by step
                    // and it will have issues if we try to run the code in multi threaded environment
        }
        System.out.println("Sum is : "+sum);


        /**
         * Declarative style. (Functional programming uses the same style)
         * what style of programming.
         * You let the system do the job for you and get the result.
         */
        int sum1= IntStream.rangeClosed(0,100)
                //.parallel()
                .map(Integer::new)
                .sum();

        System.out.println("sum1 : " + sum1);

    }

}