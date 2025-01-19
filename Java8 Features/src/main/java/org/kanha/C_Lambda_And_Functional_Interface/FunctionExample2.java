package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.Function;

public class FunctionExample2 {
    static Function<String, Integer> function = name -> name.length();

    public static void main(String[] args) {
        System.out.println(function.apply("hello"));
    }
}
