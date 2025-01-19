package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<Integer> p = (i) -> i%2==0;
        System.out.println(p.test(5)); // false
        System.out.println(p.test(10)); // true
    }
}
