package org.kanha.J_ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample1 {
    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTime) {
       long startTime = System.currentTimeMillis();
        for (int i = 1; i <= numberOfTime; i++) {
           supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static int sumSequentialStream() {
        return IntStream.rangeClosed(1, 100000)
                .sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Stream : "+
                checkPerformanceResult(ParallelStreamExample1::sumSequentialStream,
                20));
        System.out.println("Parallel Stream : " +
                checkPerformanceResult(ParallelStreamExample1::sumParallelStream,
                        20));
    }
}
