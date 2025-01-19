package org.kanha.L_Default_And_Static_Methods_In_Interface;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }
}
