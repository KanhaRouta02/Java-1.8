package org.kanha.J_ParallelStream;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> list) {
        long start = System.currentTimeMillis();
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        long duration = System.currentTimeMillis()-start;
        System.out.println("Sequential Duration: "+duration);
        return sum;
    }
    public static int parallelSum(List<Integer> list) {
        long start = System.currentTimeMillis();
        Integer sum = list.parallelStream()
                .reduce(0, (x, y) -> x + y);// perform the unboxing from Integer to int
        long duration = System.currentTimeMillis()-start;
        System.out.println("Parallel Duration: "+duration);
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(1, 1000).boxed()
                .collect(toList());
        sequentialSum(collect);
        parallelSum(collect);
    }
}
