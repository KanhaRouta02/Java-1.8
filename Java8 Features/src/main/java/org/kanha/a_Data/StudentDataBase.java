package org.kanha.a_Data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        Bike bike = new Bike();
        bike.setName("GT");
        bike.setModel("gt 650");
        Student s =  new Student("Emily",3,4.0,"female",  Arrays.asList("swimming", "gymnastics","aerobics"),30);
        s.setBike(Optional.ofNullable(bike));
        return s;
    };
    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),10);
        Student student2 = new Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"),20);
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Dave",3,4.0,"male", Arrays.asList("swimming", "gymnastics","soccer"),10);
        Student student4 = new Student("Emily",3,4.0,"female",  Arrays.asList("swimming", "gymnastics","aerobics"),30);

        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"),40);
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"),05);

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }
}
