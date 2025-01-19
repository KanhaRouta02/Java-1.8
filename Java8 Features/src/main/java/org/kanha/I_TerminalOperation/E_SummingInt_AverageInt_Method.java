package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class E_SummingInt_AverageInt_Method {
    public static int sum(){
    return   StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBook));
    }
    public static Double average(){
        return   StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBook));
    }
    public static void main(String[] args) {
        System.out.println("Total no of Books : " + sum());
        System.out.println("Avg no of Books : " + average());
    }
}
