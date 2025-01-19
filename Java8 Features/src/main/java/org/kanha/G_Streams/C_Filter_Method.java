package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
// filter() -> Filters the element in the stream.
//          -> The input of the filter is Predicate Functional interface.
public class C_Filter_Method {
    public static List<Student> filterStudents(){
     return   StudentDataBase.getAllStudents()
                .stream()
                .filter( s -> s.getGender().equals("male") )
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(filterStudents());
    }
}
