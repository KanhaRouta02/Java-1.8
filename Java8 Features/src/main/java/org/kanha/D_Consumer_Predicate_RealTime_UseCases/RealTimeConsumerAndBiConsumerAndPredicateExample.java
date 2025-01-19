package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RealTimeConsumerAndBiConsumerAndPredicateExample {
     Predicate<Student> gpa = s -> s.getGpa() >= 3.8;
     Predicate<Student>  gender = s -> s.getGender().equals("male");
     BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);
     Consumer<Student> consumerStudent = s -> {
        if(gpa.and(gender).test(s)) {
            studentBiConsumer.accept(s.getName(), s.getActivities());
        }
     };
    public void getStudentByNameAndActivites(List<Student> students){
        students.forEach(consumerStudent);
    }
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        new RealTimeConsumerAndBiConsumerAndPredicateExample().getStudentByNameAndActivites(allStudents);
    }
}
