package org.kanha.L_Default_And_Static_Methods_In_Interface;

import java.util.List;

public interface Multiplier {
 public int multiply(List<Integer> numbers);
 default int getSize(List<Integer> numbers) {
     return numbers.size();
 }
 static boolean isEmpty(List<Integer> numbers) {
     return numbers != null && numbers.size() > 0;
 }
}
