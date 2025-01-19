package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.Optional;
// findFirst() -> Return 1st element in the stream
// findAny() -> Return 1st encountered element in the stream.
//           * User to find an element in the stream.
//           * Both the function return the result type as Optional<T>.
public class H_FindFirst_FindAny_Method {
    public static Optional<Student> findAny() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDataBase.getAllStudents()
                .stream()
//                .filter(s -> s.getGpa() >= 3.9)
                .filter(s -> s.getGpa() >= 5.0)
                .findAny();
    }

    public static void main(String[] args) {
        Optional<Student> any = findAny();
        if (any.isPresent()) {
            System.out.println("Result findAny() : " + any.get());
        }else{
            System.out.println("Not found");
        }
        Optional<Student> first = findFirst();
        if (first.isPresent()) {
            System.out.println("Result findFirst() : " + first.get());
        }else{
            System.out.println("Not found");
        }
    }

}

