package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class RealTimeConsumerExample {
    public static void main(String[] args) {
//        getAllStudent();
//        getNameAndActivities();
        getGender();
    }

    public static void getAllStudent() {
        Consumer<Student> c1 = (student) -> System.out.println(student);
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1);
    }

    public static void getAllGender() {
        Consumer<Student> c1 = Student::getGender;
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(c1);
    }

    public static void getNameAndActivities() {
        Consumer<Student> name = (student) -> System.out.println(student.getName());
        Consumer<Student> activites = (student) -> System.out.println(student.getActivities());
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(name.andThen(activites));
        getAllGender();
    }

    public static void getGender() {
        Consumer<Student> gender = (student) -> System.out.println(student.getGender());
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(gender);

    }
}