package org.kanha.B_Lambda_Expression;

import java.util.function.Consumer;

@FunctionalInterface
interface StringUpper{
    String toUpperString(String s);
}
public class SimpleLambdaExample2 {
    public static void main(String[] args) {
        StringUpper length1 = (String str) -> str.toUpperCase();
        System.out.println(length1.toUpperString("Hello"));

        Consumer<String> consumer = str -> System.out.println(str.toUpperCase());
        consumer.accept("Hello");
    }
}
