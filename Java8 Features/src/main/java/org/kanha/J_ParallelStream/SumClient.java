package org.kanha.J_ParallelStream;

import java.util.stream.IntStream;

public class SumClient {
    public static void main(String[] args) {
        Sum s = new Sum();
        IntStream.rangeClosed(1, 1000).forEach(s::sum);
        System.out.println("Sequential : "+ s.getTotal());

        IntStream.rangeClosed(1, 1000).parallel().forEach(s::sum);
        System.out.println("Parallel : "+s.getTotal());
    }
}
