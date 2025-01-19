package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,String> con = (a, b) -> {
            System.out.println("a : " + a + ", b : " + b);
        };
        con.accept("Hello", "World");

        BiConsumer<Integer, Integer> multiple = (a, b) -> System.out.println("Multiple is : " + (a*b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is : " + (a/b));
        BiConsumer<Integer, Integer> modules = (a, b) -> System.out.println("Division is : " + (a%b));
        division.andThen(multiple).andThen(modules).accept(10,2);
    }
}
