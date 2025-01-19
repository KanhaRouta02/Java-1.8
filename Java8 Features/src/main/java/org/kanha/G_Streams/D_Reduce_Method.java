package org.kanha.G_Streams;

import com.sun.org.apache.regexp.internal.RE;
import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce() -> This is a terminal operation. Use to reduce the context of a stream into a single value.
//          -> It take 2 parameter
//              * 1st parameter - default or initial value
//              * 2nd parameter - BinaryOperator<T>
public class D_Reduce_Method {
    public static int multipleNumber(List<Integer> listInteger) {
        return listInteger.stream() // 1,5,2,3
                // a = 1 (initial value), b = 1 (from stream) => result 1 is returned
                // a = 1 (returned value), b= 5 (from stream) => result 5 is returned
                // a = 5 (returned value), b= 2 (from stream) => result 10 is returned
                // a = 10 (returned value), b= 3 (from stream) => result 30 is returned
                .reduce(0, (a, b) -> a + b);
    }

    public static int additionNumber(List<Integer> listInteger) {
        return listInteger.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudentDetails() {
        return StudentDataBase.getAllStudents()
                .stream()
//                .reduce((s1, s2) -> {
//                    if (s1.getGpa() > s2.getGpa()) {
//                        return s1;
//                    } else if (s2.getGpa() == s1.getGpa()) {
//                        return s1;
//                    } else {
//                        return s2;
//                    }
//                });
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 2, 3);
        System.out.println(multipleNumber(list)); // 30
        System.out.println(additionNumber(list)); // 11

        Optional<Student> optional = getHighestGpaStudentDetails();
        if (optional.isPresent()) {
            Student student = optional.get();
            System.out.println(student);
        }
    }
}
