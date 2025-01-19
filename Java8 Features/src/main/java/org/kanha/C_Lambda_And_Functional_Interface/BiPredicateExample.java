package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a <= 100 && b >= 50 ;
        System.out.println(biPredicate.test(49,55));// true
        System.out.println(biPredicate.test(55,49));// false
    }
}
