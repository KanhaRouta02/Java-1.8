package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.Predicate;

// Predicate interface default method
public class PredicateExample2 {
    static Predicate<Integer> p1 = i -> i % 2 == 0;
    static Predicate<Integer> p2 = i -> i % 5 == 0;
    public static void main(String[] args) {
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
    public static void predicateAnd(){
        System.out.println("Predicate And() : " +p1.and(p2).test(10)); // true
        System.out.println("Predicate And() : " +p1.and(p2).test(9)); // false
    }
    public static void predicateOr(){
        System.out.println("Predicate Or() : " +p1.or(p2).test(10)); // true
        System.out.println("Predicate Or() : " +p1.or(p2).test(9)); // false
        System.out.println("Predicate Or() : " +p1.or(p2).test(8)); // true
    }
    public static void predicateNegate(){
        System.out.println("Predicate Negate() : " +p1.or(p2).negate().test(8)); // true
    }
}
