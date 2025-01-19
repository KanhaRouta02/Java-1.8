package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
// map() -> convert (transfer) one type to another.
public class A_Map_Method {
    public static List<String> nameList() {
        return StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                // Student as input -> Student Name
 //             .map(s->s.getName()) // Stream<String>
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList()); // List<String>
    }
    public static Set<String> nameSet() {
        return StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                // Student as input -> Student Name
     //         .map(s->s.getName()) // Stream<String>
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toSet()); // List<String>
    }
    public static void main(String[] args) {
        System.out.println(nameList());
        System.out.println(nameSet());
    }
}
