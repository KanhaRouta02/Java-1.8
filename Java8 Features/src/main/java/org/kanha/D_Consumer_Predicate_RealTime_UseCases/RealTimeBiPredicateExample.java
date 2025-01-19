package org.kanha.D_Consumer_Predicate_RealTime_UseCases;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class RealTimeBiPredicateExample {

    BiPredicate<Double, String> biPredicate = (gpa, gender) -> gender.equals("male") && gpa >= 3.8;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name +" : " + activities);
    Consumer<Student> consumer = (student) ->{
        if(biPredicate.test(student.getGpa(), student.getGender())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };
    public void displayNameAndActivities(List<Student> students){
        students.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        new RealTimeBiPredicateExample().displayNameAndActivities(allStudents);

    }
}
