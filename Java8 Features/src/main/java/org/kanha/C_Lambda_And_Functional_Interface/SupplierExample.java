package org.kanha.C_Lambda_And_Functional_Interface;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> otpGenerate = () -> {
            String otp = "";
            for (int i = 0; i < 4; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.print(otpGenerate.get());
    }
}
