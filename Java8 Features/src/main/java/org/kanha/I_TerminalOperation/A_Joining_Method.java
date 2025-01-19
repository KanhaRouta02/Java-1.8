package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.stream.Collectors;

// joining() -> Collectors perform the string concatenation on the elements in the stream.
//           -> It has three different overloaded version.
public class A_Joining_Method {
    public static String joining_1() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String joining_2() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("_"));
    }
    public static String joining_3() {
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("_","(" , ")"));
    }

    public static void main(String[] args) {
        System.out.println("joining_1 : " + joining_1());
        System.out.println("joining_2 : " + joining_2());
        System.out.println("joining_3 : " + joining_3());
    }
}
