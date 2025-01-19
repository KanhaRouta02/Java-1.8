package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class G_PartitioningBy_Method {
   static Predicate<Student> predicate = student -> student.getGpa() >= 3.9;
    public static void pertitioningBy_1(){

        Map<Boolean, List<Student>> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(predicate));
        System.out.println(collect);
    }
    public static void pertitioningBy_2(){
        Map<Boolean, Set<Student>> collect1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(predicate, toSet()));
        System.out.println(collect1);
    }
    public static void main(String[] args) {
//     pertitioningBy_1();
     pertitioningBy_2();
    }
}
