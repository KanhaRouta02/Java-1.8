package org.kanha.G_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// limit(n) -> Limit the "n" no. of elements to be processed in the stream.
// skip(n)  -> Skip the "n" no. of elements from the stream.
//           * This 2 function is helps to create a sub-stream.
public class F_Limit_Skip_Method {
    public static Optional<Integer> limit(List<Integer> list){
       return list.stream()
                .limit(2)
                .reduce(Integer::sum);
    }
    public static Optional<Integer> skip(List<Integer> list){
        return list.stream()
                .skip(2)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 12, 18,20);
        System.out.println(list);
        Optional<Integer> limit = limit(list);
        if(limit.isPresent()){
            System.out.println(" Limit result : "+limit.get());
        }else {
            System.out.println("Empty List");
        }

        Optional<Integer> skip = skip(list);
        if(skip.isPresent()){
            System.out.println(" Skip result : "+skip.get());
        }else {
            System.out.println("Empty List");
        }
    }
}
