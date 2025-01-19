package org.kanha.G_Streams;

import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;

public class MapReduceFilterExample {
    private int getTolatBook() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equals("female"))
                .map(Student::getNoteBook)
//                .reduce(0, (a, b) -> a + b);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(new MapReduceFilterExample().getTolatBook());
    }
}
