package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class RealTimePredicateExample {
    static Predicate<Student> gpa = s -> s.getGpa() >= 3.8;
    static Predicate<Student>  gender = s -> s.getGender().equals("male");
    public static void main(String[] args) {
        getStudentByGPA();
        filterStudent();
    }
    public static void getStudentByGPA(){
        List<Student> all = StudentDataBase.getAllStudents();
        all.forEach((student) -> {
            if (gpa.test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void filterStudent(){
        List<Student> all = StudentDataBase.getAllStudents();
        all.forEach((student) -> {
            if (gpa.and(gender).test(student)) {
                System.out.println(student);
            }
        });
    }
}
