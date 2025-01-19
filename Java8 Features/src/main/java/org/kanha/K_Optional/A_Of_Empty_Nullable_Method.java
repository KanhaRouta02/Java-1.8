package org.kanha.K_Optional;

import java.util.Optional;

public class A_Of_Empty_Nullable_Method {
    public static Optional<String> ofNullable() {
        return Optional.ofNullable("kanha");
    }
    public static Optional<String> of() {
        return Optional.of("kanha");
    }
    public static Optional<String> empty() {
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println("ofNullable : "+ofNullable());
        System.out.println("of : "+of());
        System.out.println("empty : "+empty());
    }
}
