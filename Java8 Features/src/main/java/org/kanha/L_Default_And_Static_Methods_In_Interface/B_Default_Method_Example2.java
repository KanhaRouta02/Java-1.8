package org.kanha.L_Default_And_Static_Methods_In_Interface;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class B_Default_Method_Example2 {
    static Consumer<Student> consumer = s -> System.out.println(s);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> greatComparator = Comparator.comparingDouble(Student::getGradeLevel);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa).reversed();

    public static void sortByName(List<Student> students) {
        System.out.println("After sort byName :");
        students.sort(nameComparator);
        students.forEach(consumer);
    }
    public static void sortByGpa(List<Student> students) {
        System.out.println("After sort byGpa :");
        students.sort(gpaComparator);
        students.forEach(consumer);
    }
    public static void comparatorChaining(List<Student> students) {
        students.sort(greatComparator.thenComparing(nameComparator));
        students.forEach(consumer);
    }
    public static void sortWithNullValue(List<Student> students) {
        System.out.println("After sort withNullValue :");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println("Before sort ");
        allStudents.forEach(consumer);
//        sortByName(allStudents);
//        sortByGpa(allStudents);
//        comparatorChaining(allStudents);
        sortWithNullValue(allStudents);
    }
}
