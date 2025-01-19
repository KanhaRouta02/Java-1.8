package org.kanha.L_Default_And_Static_Methods_In_Interface;

import java.util.*;

public class A_Default_Method_Example1 {
    public static void main(String[] args) {
        // Sort the list names in alphabetic order
        List<String> list = Arrays.asList("kanha", "sahil", "babun","chandru","atik");
        // prior java 8
        Collections.sort(list);
        System.out.println("Sort element using Collections.sort() : " + list);

        // java 8
        list.sort(Comparator.naturalOrder());
        System.out.println("Sort element using default List.sort() : " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Sort element using default List.sort() : " + list);


    }


}
