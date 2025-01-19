package org.kanha.B_Lambda_Expression;

import java.util.function.Consumer;
// Restriction - 2
public class  LambdaLocalVariable2 {
    public static void main(String[] args) {
        int value = 4;
        Consumer<Integer> consumer = (i) -> {
      //      value++; not allowed
            System.out.println(value + i);
        };
        consumer.accept(5);
    }
}
