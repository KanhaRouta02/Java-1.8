package org.kanha.A_Imparative_and_declaratve_example;

import java.util.stream.IntStream;

public class ImperativeAndDeclarativeProgrammingExample {
    public static void main(String[] args) {
        // Sum of 1 - 100 natural number.
        // ==============================
        /*
         *   Imperative Style of Programming - How style of programming
         * */
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Imperative Style of Programming : " + sum); // 5050
        /*
         * Declarative Style of Programming - What style of programming
         * */
        int sum1 = IntStream.rangeClosed(0, 100)
                .sum();
        System.out.println("Declarative Style of Programming : " + sum1); //5050
    }
}
