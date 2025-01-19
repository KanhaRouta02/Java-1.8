package org.kanha.K_Optional;

import org.kanha.a_Data.Bike;
import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class D_map_flatMap_filter_Method {
    // filter
    public static void optionalFilter(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student.filter( s -> s.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }
    // map
    public static void optionalMap(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(student.isPresent()){
            Optional<String> s1 = student.filter(s -> s.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(student.get());
        }
    }
    // flatMap
    public static void optionalFlatMap2(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = student.filter(s -> s.getGpa() >= 3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
       name.ifPresent(s -> System.out.println(name.get()));
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap2();
    }
}
