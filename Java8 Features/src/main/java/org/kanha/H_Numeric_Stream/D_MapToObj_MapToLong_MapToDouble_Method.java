package org.kanha.H_Numeric_Stream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class D_MapToObj_MapToLong_MapToDouble_Method {
    public static List<Integer> mapToObject(){
      return IntStream.rangeClosed(1,15).mapToObj((i)->{
            return new Integer(i);
        })
                .collect(toList());
    }
public static long mapToLong(){
     return   IntStream.rangeClosed(1,5)
                .mapToLong((i)->i)
                .sum();
}
    public static double mapToDouble(){
        return   IntStream.rangeClosed(1,5)
                .mapToDouble((i)->i)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObject : "+mapToObject());
        System.out.println("mapToLong : "+mapToLong());
        System.out.println("mapToDouble : "+mapToDouble());
    }
}
