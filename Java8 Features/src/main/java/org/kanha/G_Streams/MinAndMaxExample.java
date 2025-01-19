package org.kanha.G_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMaxExample {
    public int getMax(List<Integer> list) {
        return list.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
    }
    public static Optional<Integer> getMaxOptional(List<Integer> list) {
//        return list.stream()
//                .reduce(Integer::max);
//        return list.stream()
//                .reduce((a, b) -> a > b ? a : b);
        return list.stream().max(Integer::compareTo);

    }
    public static Optional<Integer> getMinOptional(List<Integer> list) {
        return list.stream()
                .reduce(Integer::min);
//        return list.stream()
//                .reduce((a, b) -> a < b ? a : b);
//        return list.stream().min(Integer::compareTo);

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
 //      List<Integer> list = new ArrayList<>();
        System.out.println(new MinAndMaxExample().getMax(list)); // 30
        Optional<Integer> maxOptional = getMaxOptional(list);
        if (maxOptional.isPresent()) {
            System.out.println(" Max value : "+maxOptional.get());
        }else {
            System.out.println("Not found");
        }
        Optional<Integer> minOptional = getMinOptional(list);
        if (minOptional.isPresent()) {
            System.out.println(" Min value : "+minOptional.get());
        }else {
            System.out.println("Not found");
        }
    }
}
