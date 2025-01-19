package org.kanha.B_Lambda_Expression;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        /*
        *  prior java 8
        */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2
                                         // 1 -> o1 > o2
                                         // -1 -> o1 < 02
            }
        };
        System.out.println(comparator.compare(1, 2));
        /*
        *  using lambda
        */
        Comparator<Integer> comparator2 = (Integer o1, Integer o2) -> o1.compareTo(o2);
        System.out.println(comparator2.compare(1, 2));

        Comparator<Integer> comparator3 = (o1, o2) ->  o1.compareTo(o2);
        System.out.println(comparator3.compare(1, 2));

    }
}
