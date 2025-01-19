package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class RealTimeBiConsumerExample {
    public static void main(String[] args) {
        getStuentNameAndActivites();
    }
    public static void getStuentNameAndActivites(){
        BiConsumer<String, List<String>> data = (name, activities) -> System.out.println(name + " : "+activities);
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(student -> data.accept(student.getName(), student.getActivities()));


    }
}
