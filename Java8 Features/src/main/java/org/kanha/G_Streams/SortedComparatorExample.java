package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedComparatorExample {
    public static List<Student> sortByName(){
      return   StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortByGpa(){
        return   StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortByGpaDesc(){
        return   StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sorted by name in ascending order");
        sortByName().forEach(System.out::println);

        System.out.println("Sorted by GPA in ascending order");
        sortByGpa().forEach(System.out::println);

        System.out.println("Sorted by GPA in descending order");
        sortByGpaDesc().forEach(System.out::println);
    }
}
