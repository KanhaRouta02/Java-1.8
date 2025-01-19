package org.kanha.E_MethodReferance;

import java.util.function.Consumer;

public class ConsumerMethodReferanceExample {
    static Consumer<String> consumer = name -> System.out.println("Hello " + name);

    static Consumer<String> consumer1 = ConsumerMethodReferanceExample::acceptMy;

    public static void main(String[] args) {
        consumer.accept("Good Morning.. Kanha");
        consumer1.accept("Good Morning.. Kanha");
    }

    private static void acceptMy(String name) {
        System.out.println("Hello " + name);
    }
}
