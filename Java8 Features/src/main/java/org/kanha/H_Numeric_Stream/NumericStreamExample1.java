package org.kanha.H_Numeric_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample1 {
    private static int sunOfInteger(List<Integer> list){
      return   list.stream().reduce(0, Integer::sum); // unboxing to convert the Integer to int
    }
    public static int sunOfIntegerIntStream(){
        return IntStream.rangeClosed(1, 6).sum();
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(sunOfInteger(list));
        System.out.println(sunOfIntegerIntStream());

    }
}
