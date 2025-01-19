package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 3));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Max Resul t: " + maxBy.apply(2, 3));
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Min Resul t: " + minBy.apply(2, 3));
    }
}
