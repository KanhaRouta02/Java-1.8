package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {
    static Predicate<Student> gpa = (s -> s.getGpa()>=3.9);
    static Predicate<Student> gender = (s -> s.getGender().equals("male"));


    public static void main(String[] args) {
        Map<String, List<String>> collect = StudentDataBase.getAllStudents().stream()
                .filter(gpa)
                .filter(gender)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(collect);
    }
}
