package org.kanha.K_Optional;
import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;
import java.util.Optional;
// Optional -> Introduce as part of java8 to represent a non-null value.
//          -> Avoid null pointer exception and unnecessary null checks
//          -> Inspired from the new language such as scale, groovy.
public class OptionalExample1 {
    public static String getStudentName(){
//      Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student != null){
            return student.getName();
        }
        return null;
    }
    public static Optional<String> getStudentNameOptional(){
//        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.ofNullable(null);
        if(student.isPresent()){
           return student.map(Student::getName);
        }
        return Optional.empty();
    }
    public static void main(String[] args) {
//        String studentName = getStudentName();
//        if(studentName != null){
//            System.out.println("Length of name ("+ studentName+ ") : "+ studentName.length());
//        }
//        else{
//            System.out.println("Name is null");
//        }
        Optional<String> studentNameOptional = getStudentNameOptional();
        if(studentNameOptional.isPresent()){
            System.out.println(studentNameOptional.get());
        }else {
            System.out.println("Empty Student...");
        }
    }
}
