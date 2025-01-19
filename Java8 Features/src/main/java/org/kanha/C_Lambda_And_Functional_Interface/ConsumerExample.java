package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
         Consumer<String> con = s -> System.out.println(s.toUpperCase());
         con.accept("Kanha");
    }
}
