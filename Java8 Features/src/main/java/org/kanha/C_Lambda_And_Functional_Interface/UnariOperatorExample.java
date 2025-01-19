package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.UnaryOperator;

public class UnariOperatorExample {
    static UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Hello"));
    }
}
