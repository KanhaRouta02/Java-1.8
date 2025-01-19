package in.kanha.number;

import java.util.*;

public class NumberProgrammingWithJava8 {
    public static void main(String[] args) {
        int[] intArray = {15, 8, 9, 8, 8, 50, 30, 27, 20, 18, 4, 15, 9, 50, 45};
        List<Integer> intList = Arrays.asList(10, 5, 20, 2, 3, 8, 8, 15, 80);
// 1) Remove duplicate element from an array.
//===========================================

        /* Using java 8 */

        /*
        // Convert array to a Set to remove duplicates
        Set<Integer> uniqueSet = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.toSet());

        // Convert the Set back to an array
        int[] result = uniqueSet.stream()
                .mapToInt(Integer::intValue) // convert Integer to int
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(result));
        */

        /* Using set */
        /*
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(int i : intArray) {
            uniqueSet.add(i);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for(int i : uniqueSet) {
            uniqueArray[index++] = i;
        }
        Arrays.sort(uniqueArray);
        System.out.println(Arrays.toString(uniqueArray));
        */

// 2) Count the frequency of each element in an array.
//=====================================================
        /*
        Map<Integer, Long> frequencyMap = Arrays.stream(intArray)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        frequencyMap.forEach((k, v) -> System.out.println(k + " : " + v));
        */

// 3) Find the sum of all numbers in a list.
//==========================================

        // Using java8
        /*
        int sum = Arrays.stream(intArray)
                .sum();
        System.out.println(sum);
        */

        //
        /*
        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }
        System.out.println(sum);
        */

// 4) Find the average of all numbers in a list.
//=============================================

        /*
        double average = IntStream.of(intArray)
                .average()
                .orElse(0);
        System.out.println(average);
        */

        /*
        double average = intList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average);

        int sum = 0;
        for(int i : intList) {
            sum += i;
        }
        double avg = (double) sum / intList.size();
        System.out.println(avg);
        */

// 5) Find the maximum number in a list.
//======================================

        // Using java8
        /*
        int maxValue = intList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("List is empty"));
        System.out.println(maxValue);
        */
        /*
        Integer maxValue = Collections.max(intList);
        System.out.println(maxValue);
        */

        /*
        int maxValue = IntStream.of(intArray)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty"));
        System.out.println(maxValue);
        */

// 6) Count the number of even numbers in a list.
//==============================================

        /*
        intList.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
         */

         /*
         IntStream.of(intArray)
                 .filter(val -> val%2 == 0)
                 .forEach(System.out::println);
         */

// 7) Find all prime numbers in a list.
// ===================================

        /*
        intList.stream()
                .filter(NumberProgrammingWithJava8::isPrime)
                .forEach(System.out::println);
        */

// 8) Check if all numbers in a list are positive.
// ==============================================

        /*
        boolean allPositive = intList.stream()
                .allMatch(integer -> integer > 0);
        System.out.println(" All the number of the list is +ve : "+allPositive);
        */

        /*
        boolean allPositive = Arrays.stream(intArray)
                .allMatch(num -> num > 0);
        System.out.println(" All the number of the arrays is +ve : "+allPositive);
        */

// 8) Sort numbers in ascending order.
// ===================================

        /*
        intList.stream()
                .sorted()
                .forEach(System.out::println);
        */

        /*
        intList.stream()
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);
         */

        /*
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        */

        /*
        Integer[] array = Arrays.stream(intArray)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort( array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
        */

// 9) Group numbers by even and odd.
// =================================

        /*
        Map<String, List<Integer>> groupedByEvenOdd = intList.stream()
                .distinct()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "even" : "odd"));
        groupedByEvenOdd.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        */

// 10) Partition numbers into positive and negative.
// ================================================

        /*
        Map<Boolean, List<Integer>> groupedByPositiveAndNegative =  intList.stream()
                .distinct()
                .collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        */

// 11) Find the second largest number in a list.
// =============================================

        /*
        int secondLargest = intList.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(secondLargest);
        */

        int secondLargest =  Arrays.stream(intArray)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println(secondLargest);
    }


    public static boolean isPrime(int num){
         if(num <= 1) return false;
         for(int i=2; i<num/2; i++){
             if(num % i == 0) return false;
         }
         return true;
    }
}
