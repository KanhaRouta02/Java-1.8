package org.kanha.L_Default_And_Static_Methods_In_Interface;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> list = Arrays.asList(1, 2, 5);
        System.out.println("Result is : "+ multiplier.multiply(list));
        System.out.println("Size is : "+ multiplier.getSize(list));
        System.out.println("Static isEmpty is : "+ Multiplier.isEmpty(list));

    }
}
