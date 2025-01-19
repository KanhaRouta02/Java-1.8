package org.kanha.G_Streams;

import org.kanha.a_Data.StudentDataBase;
// anyMatch() -> Return true if any one of the element matches the predicate, otherwise false.
// allMatch() -> Return true if all the element in the stream matches the predicate, otherwise false.
// noneMatch() -> Just opposite to allMatch(), Return ture if none of the element in the stream matches the predicate, otherwise false.
//            * All these functions takes in a Predicate as an input and return boolean as output.

public class G_AnyMatch_AllMatch_NonMatch_Method {
    public static boolean allMatch(){
    return  StudentDataBase.getAllStudents()
                .stream()
//              .allMatch((student) -> student.getGpa() >= 3.6); // false
                .allMatch((student) -> student.getGpa() >= 3.5); // true
    }
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
//                .anyMatch(student -> student.getGpa() >= 4.0); // true
                .anyMatch(student -> student.getGpa() >= 4.1); // false

    }
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
//              .noneMatch(student -> student.getGpa() >= 4.0); // false
                .noneMatch(student -> student.getGpa() >= 4.1); // ture

    }
    public static void main(String[] args) {
        System.out.println("Result allMatch() : "+allMatch());
        System.out.println("Result anyMatch() : "+anyMatch());
        System.out.println("Result noneMatch() : "+noneMatch());
    }
}
