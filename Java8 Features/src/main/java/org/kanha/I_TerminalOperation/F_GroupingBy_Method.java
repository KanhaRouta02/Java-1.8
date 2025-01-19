package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import javax.swing.*;
import java.util.*;

import static java.util.stream.Collectors.*;

public class F_GroupingBy_Method {
    public static void groupStudentByGender() {
        Map<String, List<Student>> collect = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(collect);
    }
    public static void customiseGroupingBy(){
        Map<String, List<Student>> collect1 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s -> s.getGpa()>= 3.9 ? "Outstanding" : "Ok oK"));
        System.out.println(collect1);
    }

    public static void twoLevelGrouping_1(){
        Map<String, Map<String, List<Student>>> collect2 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender, groupingBy(s -> s.getGpa() >= 3.9 ? "Outstanding" : "Ok oK")));
        System.out.println(collect2);
    }
    public static void twoLevelGrouping_2(){
        Map<String, Integer> collect3 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoteBook)));
        System.out.println(collect3);
    }
    public static void threeLevelGrouping_3(){
        LinkedHashMap<String, Set<Student>> collect4 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(collect4);
    }

    public static void calculateTopGpa(){
        Map<String, Optional<Student>> collect5 = StudentDataBase.getAllStudents().stream()
                .collect(groupingBy(Student::getGender, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(collect5);
    }


    public static void main(String[] args) {
//        groupStudentByGender();
 //       customiseGroupingBy();
  //      twoLevelGrouping_1();
//        twoLevelGrouping_2();
//        threeLevelGrouping_3();
        calculateTopGpa();





    }
}
