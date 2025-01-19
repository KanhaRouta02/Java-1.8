package org.kanha.B_Lambda_Expression;

import java.util.function.Consumer;

interface StringLength {
    public int length(String str);
}
public class SimpleLambdaExample3 {
    public static void main(String[] args) {
        StringLength strLength = (str) -> str.length();
        System.out.println(strLength.length("kanha"));

        Consumer<String> length = (str) -> System.out.println(str.length());
        length.accept(" kanha");

        Consumer<String> length1 = SimpleLambdaExample3::accept;
        length1.accept("kanha");
    }
    private static void accept(String str) {
        System.out.println(str.length());
    }
}
