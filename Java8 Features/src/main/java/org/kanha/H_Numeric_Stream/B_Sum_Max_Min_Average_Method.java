package org.kanha.H_Numeric_Stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class B_Sum_Max_Min_Average_Method {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println("Sum value : " +sum);

        OptionalInt max = IntStream.rangeClosed(1, 50).max();
        System.out.println("Max value : " + (max.isPresent() ? max.getAsInt() : 0));

        OptionalLong min = LongStream .rangeClosed(5, 50).min();
        System.out.println("Max value : " + (min.isPresent() ? min.getAsLong() : 0));

        OptionalDouble average = IntStream.rangeClosed(10, 50).average();
        System.out.println("Average value : " + (average.isPresent() ? average.getAsDouble() : 0));
    }
}
