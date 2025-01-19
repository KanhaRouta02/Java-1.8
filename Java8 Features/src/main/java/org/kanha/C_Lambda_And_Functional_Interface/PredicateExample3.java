package org.kanha.C_Lambda_And_Functional_Interface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class PredicateExample3 {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 23);
        Student s2 = new Student("Mark ", 25);
        Student s3 = new Student("Buttlor", 24);
        Student s4 = new Student("Gill", 21);
        List<Student> students = Arrays.asList(s1, s2, s3, s4);
        Predicate<Student> pre = s -> s.age >= 23;
        for(Student student : students) {
            if(pre.test(student)) {
                System.out.println(student.name);
            }
        }
    }
}
