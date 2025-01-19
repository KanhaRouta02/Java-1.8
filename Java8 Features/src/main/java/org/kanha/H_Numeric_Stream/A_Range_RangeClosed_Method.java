package org.kanha.H_Numeric_Stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class A_Range_RangeClosed_Method {
    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 50);
        System.out.println("Range Count : " + range.count()); // 49

        IntStream rangeClosed = IntStream.rangeClosed(1, 50);
        System.out.println("RangeClosed Count : " + rangeClosed.count()); // 50

        IntStream.range(1,50).forEach((value -> System.out.print(value + (value < 49 ? ", " : ""))));
        System.out.println();
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + (value < 50 ? ", " : "")));
        System.out.println();

        LongStream.range(1,50).forEach((value -> System.out.print(value + (value < 49 ? ", " : ""))));
        System.out.println();
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + (value < 50 ? ", " : "")));
        System.out.println();

        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value -> System.out.print(value + (value < 50 ? ", " : "")));
    }
}
