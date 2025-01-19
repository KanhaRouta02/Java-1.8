package org.kanha.K_Optional;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.Optional;
import java.util.function.Supplier;

public class B_orElse_orElseGet_orElseThrow_Method {
    // orElse()
    public static String optionalOrElse(){
//      Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String name = student.map(Student::getName).orElse("Default");
        return name;
    }
   // orElseGet
    public static String optionalOrElseGet(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        String name = student.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    public static String optionalOrElseThrow(){
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        String name = student.map(Student::getName).orElseThrow(()->new RuntimeException("No data available.."));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("orElse() : " + optionalOrElse());
        System.out.println("orElseGet() : " + optionalOrElseGet());
        System.out.println("orElseThrow() : " + optionalOrElseThrow());
    }
}
