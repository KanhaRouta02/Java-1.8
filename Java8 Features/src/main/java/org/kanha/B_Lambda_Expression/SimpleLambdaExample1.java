package org.kanha.B_Lambda_Expression;

import java.util.function.BiFunction;

@FunctionalInterface
interface Add{
    int add(int a, int b);
}
public class SimpleLambdaExample1  {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;
        System.out.println(add.add(10, 20));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a+b;
        System.out.println(biFunction.apply(2, 3));
    }
}
