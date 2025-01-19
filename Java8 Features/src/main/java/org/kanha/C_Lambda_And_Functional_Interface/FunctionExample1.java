package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample1 {
   static Function<String, String> function = (name) ->  name.toUpperCase(Locale.ROOT);
   static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" Routa");
    public static void main(String[] args) {
        System.out.println("Function : " + function.apply("kanha")); // KANHA
        System.out.println("AndThen : " + function.andThen(addSomeString).apply("kanha")); // KANHARouta
        System.out.println("Compose : " + function.compose(addSomeString).apply("kanha")); // KANHAROUTA

    }
}
