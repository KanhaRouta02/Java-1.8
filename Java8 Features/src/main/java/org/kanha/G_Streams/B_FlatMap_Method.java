package org.kanha.G_Streams;
import org.kanha.a_Data.Student;
import org.kanha.a_Data.StudentDataBase;
import java.util.List;
import java.util.stream.Collectors;
// flatMap() -> Convert one type to another type as like map()
//           -> Used in context of stream where each element in stream represent multiple element
public class B_FlatMap_Method {
    public static List<String> getAllActivities() {
        return StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Long getAllActivitiesCount() {
        return StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();

    }

    public static void main(String[] args) {
        System.out.println(getAllActivities());
        System.out.println(getAllActivitiesCount());
    }
}
