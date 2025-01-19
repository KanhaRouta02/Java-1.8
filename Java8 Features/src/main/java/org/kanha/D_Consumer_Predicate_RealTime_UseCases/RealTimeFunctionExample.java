package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class RealTimeFunctionExample {
    static Function<List<Student>, Map<String, Double>> studentFunction = students -> {
        Map<String, Double> map = new HashMap<>();
        students.forEach((student ->{
            if(RealTimePredicateExample.gender.test(student)) {
                map.put(student.getName(), student.getGpa());
            }
        }));
        return map;
    };
    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
