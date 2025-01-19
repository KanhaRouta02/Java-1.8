package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealTimeBiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach(student -> {
            if(predicate.test(student)) {
                map.put(student.getName(), student.getGpa());
            }
        });
        return map;
    };
    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), RealTimePredicateExample.gender));
    }
}
