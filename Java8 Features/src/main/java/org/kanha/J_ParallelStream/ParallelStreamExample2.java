package org.kanha.J_ParallelStream;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample2 {

    public static List<String> sequentialStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> collect = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(" Sequential time taking : " + (endTime - startTime));
        return collect;
    }

    public static List<String> parallelStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> collect = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .parallel()
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println(" Parallel time taking : " + (endTime - startTime));
        return collect;
    }

    public static void main(String[] args) {
        sequentialStudentActivities();
        parallelStudentActivities();

    }
}
