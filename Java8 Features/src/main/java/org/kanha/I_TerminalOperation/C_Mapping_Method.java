package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class C_Mapping_Method {

    public static void main(String[] args) {
        List<String> collect = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println(collect);
    }
}
