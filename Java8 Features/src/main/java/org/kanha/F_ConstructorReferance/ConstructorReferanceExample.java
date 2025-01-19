package org.kanha.F_ConstructorReferance;

import java.util.function.Function;
import java.util.function.Supplier;

class Student{
    String name;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    Student(){
        System.out.println("Student");
    }
    public Student(String name) {
        this.name = name;
    }
}
public class ConstructorReferanceExample {
    static Supplier<Student> supplier = Student::new;
    static Function<String, Student> function = Student::new;
    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(function.apply("Kanha"));
    }
}
