package org.kanha.K_Optional;

import java.util.Optional;

public class C_isPresent_ifPresent_Method {
    public static void main(String[] args) {
        // isPresent
        Optional<String> optional = Optional.ofNullable("Kanha");
        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        // ifPresent
        optional.ifPresent( s-> System.out.println(s));
    }
}
