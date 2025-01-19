package org.kanha.H_Numeric_Stream;

import javax.jnlp.IntegrationService;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C_Boxing_OnBoxing_Method {
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 15)// intstream 1 - 15
                // int
                .boxed()
                // Integer
                .collect(Collectors.toList());
    }
    public static int  onBoxing(List<Integer> list) {
        //wrapper to primitive
      return   list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing : "+boxing());
        List<Integer> list =  boxing();
        System.out.println("On Boxing : "+onBoxing(list));
    }
}
