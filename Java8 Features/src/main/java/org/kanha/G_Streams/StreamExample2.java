package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample2 {
   public static Optional<Student> highestGpa(){
      return  StudentDataBase.getAllStudents()
               .stream()// stream<Student>
//               .map(Student::getGpa) // stream<Double>
               .reduce((student1, student2) ->{
                   if(student1.getGpa() > student2.getGpa()){
                       return student1;
                   }else {
                       return student2;
                   }
               });
   }
    public static void main(String[] args) {
//
//  //      Optional<Double> v = highestGpa();
//        if(v.isPresent()){
//            System.out.println(v.get());
//        }else{
//            System.out.println("No high GPA");
//        }

    }
}
