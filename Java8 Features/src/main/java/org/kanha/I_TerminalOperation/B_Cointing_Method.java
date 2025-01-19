package org.kanha.I_TerminalOperation;

import org.kanha.a_Data.StudentDataBase;

import java.util.stream.Collectors;

public class B_Cointing_Method {
    public static long count(){
     return   StudentDataBase.getAllStudents()
                .stream()
                .filter(s->s.getGpa()>=3.9)
                .collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println(count());
    }
}
