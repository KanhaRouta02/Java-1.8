package in.kanha.collection;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, 101, "Alice", "alice@example.com", "New York", Arrays.asList("Cricket", "Football"));
        Student student2 = new Student(2, 102, "John", "john@gmail.com", "New Delhi", Arrays.asList("Badminton", "Football"));
        Student student3 = new Student(3, 103, "Scoot", "scoot@example.com", "Punjab", Arrays.asList("Cricket", "Kabaddi"));
        Student student4 = new Student(4, 104, "Json", "json@gmail.com", "Punjab", Arrays.asList("Basketball"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4);
        //students.forEach(System.out::println);

//---------------------------------------------------------------------------------------------------
//  Basic Operations :->
//---------------------------------------------------------------------------------------------------
//  1)  Find all students with a specific activity (e.g., "Cricket").
//==================================================================
       /*
       Predicate<Student> playsCricket = student -> student.getActivities().contains("Cricket");
       List<Student> studentWithCricket = students.stream()
                .filter(playsCricket)
                .toList();
        studentWithCricket.forEach(System.out::println);
        */

//  2)  Filter students who have more than 1 activity.
//====================================================
       /*
       Predicate<Student> havingMoreThanOneActivities = student -> student.getActivities().size() > 1;
       List<Student>  studentWithActivityOne = students.stream()
                .filter(havingMoreThanOneActivities)
                .toList();
        studentWithActivityOne.forEach(System.out::println);
        */

//  3)  Get a list of all student names.
//======================================
        /*
        List<String> allStudentName = students.stream()
                .map(Student::getName)
                .toList();
        allStudentName.forEach(System.out::println);
        */
        /*
        Function<Student, String> name = Student::getName;
        List<String> allStudentName = students.stream()
                .map(name)
                .toList();
        allStudentName.forEach(System.out::println);
        */

//  4)  Get a list of unique activities across all students.
//==========================================================
        /*
        List<List<String>> uniqueActivities = students.stream()
                .map(Student::getActivities)
                .distinct()
                .toList();
        uniqueActivities.forEach(System.out::println);
        */
//        [Cricket, Football]
//        [Badminton, Football]
//        [Cricket, Kabaddi]
//        [Cricket]
        /*
        List<String> uniqueActivities = students.stream()
                .flatMap(student -> student.getActivities().stream()) // Flatten all hobby lists into a single stream
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect as a list
        System.out.println(uniqueActivities);
        */

//  5)  Count the number of students living in a specific city (e.g., "New York").
//===============================================================================
        /*
        Predicate<Student> countStudents = student -> student.getAddress().equals("New York");
        long count = students.stream()
                .filter(countStudents)
                .count();
        System.out.println(count);
        */

//--------------------------------------------------------------------------------------------------------
// Mapping and Reducing :->
//----------------------------------------------------------------------------------------------------------------
//  6)  Find the student with the highest roll number and Find the student with the lowest roll number.
//====================================================================================================
        /*
        Optional<Student> maxRollNumber = students.stream()
                .collect(maxBy(Comparator.comparing(Student::getId)));
        maxRollNumber.ifPresent(System.out::println);

        Optional<Student> minRollNumber = students.stream()
                .collect(minBy(Comparator.comparing(Student::getId)));
        minRollNumber.ifPresent(System.out::println);
        */
        /*
        Optional<Student> maxRollNumber = students.stream()
                .max(Comparator.comparingInt(Student::getId));
        maxRollNumber.ifPresent(System.out::println);
        Optional<Student> minRollNumber = students.stream()
                .min(Comparator.comparingInt(Student::getId));
        minRollNumber.ifPresent(System.out::println);
        */

//  7)  Create a comma-separated string of all student names.
//==========================================================
        /*
        Function<Student, String> names = Student::getName;
        List<String> allStudentName = students.stream()
                .map(names)
                .toList();
        for(String name : allStudentName ){
            System.out.print(name+ ", ");
        */
        /*
        String studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
        System.out.println(studentNames);
        */

//  8) Calculate the total number of activities across all students.
//=================================================================
        /*
        Long totalActivites = 0l;
        List<List<String>> allActivites = students.stream()
                .map(Student::getActivities)
                .toList();
        for (List<String> activities : allActivites) {

            for (String activity : activities) {
                totalActivites ++;
            }
        }
        System.out.println(totalActivites);
         */
        /*
        int sum = students.stream()
                .mapToInt(s -> s.getActivities().size())
                .sum();
        System.out.println(sum);
        */

//  9) Find the sum of all roll numbers.
//=====================================
        /*
        int sum = students.stream()
                .mapToInt(Student::getRoll)
                .sum();
        System.out.println(sum);
        */

// ----------------------------------------------------------------------------------------------
//  Grouping and Partitioning :->
//----------------------------------------------------------------------------------------------
//  10) Group students by the city they live in.
//=============================================
        /*
        Map<String, List<Student>> studentWithCity = students.stream()
                .collect(Collectors.groupingBy(student -> student.getAddress()));
        studentWithCity.forEach((city, listStudents) -> {
            System.out.print("City: " + city +": ");
            listStudents.forEach(s -> System.out.print(s.getName()+" "));
            System.out.println();
        });
       */
//  11) Group students by the number of activities they are involved in.
//=====================================================================
        /*
        Map<Integer, List<Student>> allStudentActivitiesCount = students.stream()
                .collect(Collectors.groupingBy(student -> student.getActivities().size()));
        allStudentActivitiesCount.forEach((countActivites, listStudentActivities) -> {
            System.out.println("Activities involved: " + countActivites +" ");
            listStudentActivities.forEach(s->System.out.println(" => " +s.getName()));
            System.out.println();
        });
        */

//  12) Partition students into two groups: those with more than 2 activities and those with 1 or fewer.
//=====================================================================================================
       /*
        Map<Boolean, List<Student>> studentWithPartition = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getActivities().size() > 1));
        List<Student> studentWithPartitionMoreThanTwo = studentWithPartition.get(true);
        List<Student> studentWithPartitionLessThanTwo = studentWithPartition.get(false);
        System.out.println("Student With Partition MoreThan Two : " );
        studentWithPartitionMoreThanTwo.forEach(s -> System.out.println(s.getName()));
        System.out.println("Student With Partition LessThan Two : " );
        studentWithPartitionLessThanTwo.forEach(s -> System.out.println(s.getName()));
        */

//  13) Group students by the first letter of their name.
//=======================================================
        /*
        Function<Student, Character> firstCharacters = s -> s.getName().charAt(0);
        Map<Character, List<Student>> studentWithFirstLetter = students.stream()
                .collect(Collectors.groupingBy(firstCharacters));
        studentWithFirstLetter.forEach((firstCharacter, studentList) ->{
            System.out.println(" Student with 1st Character : "+ firstCharacter);
            studentList.forEach(student -> System.out.println(student.getName()));
        });
        */

//  14) Partition students into two groups based on whether their email contains "example.com".
//============================================================================================
        /*
        Map<Boolean, List<Student>> partitionStudentByMail = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getEmail().contains("example.com")));
        List<Student> partitionStudentByMailTrue = partitionStudentByMail.get(true);
        List<Student> partitionStudentByMailFalse = partitionStudentByMail.get(false);
        System.out.println("Student with mail Having 'example.com' is : " );
        partitionStudentByMailTrue.forEach(System.out::println);
        System.out.println("Student with mail Having 'gmail.com' is : " );
        partitionStudentByMailFalse.forEach(System.out::println);
        */
        
//-----------------------------------------------------------------------------------------------------------------------------  
// Sorting        
//--------------------------------------------------------------------------------------------------------------------------------------
//  16) Sort students by their roll number in ascending order.
//============================================================
        /*
        List<Student> sortedStudentByAscending = students.stream()
                .sorted((s1, s2) -> s1.getRoll().compareTo(s2.getRoll()))
                .toList();
        sortedStudentByAscending.forEach(System.out::println);
        System.out.println("=========================================================");
        List<Student> sortedStudentByDescending = students.stream()
                .sorted((s1, s2) -> s2.getRoll().compareTo(s1.getRoll()))
                .toList();
        sortedStudentByDescending.forEach(System.out::println);
         */
        /*
        List<Student> sortedStudentByAscending = students.stream()
                .sorted(Comparator.comparingInt(Student::getRoll))
                .toList();
        sortedStudentByAscending.forEach(System.out::println);
        System.out.println("=========================================================");
        List<Student> sortedStudentByDescending = students.stream()
                .sorted(Comparator.comparingInt(Student::getRoll).reversed())
                .toList();
        sortedStudentByDescending.forEach(System.out::println);
        */


//  17) Sort students by their name in descending order.
//=====================================================
        /*
        List<Student> sortedStudentNameByAscending = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
        sortedStudentNameByAscending.forEach(System.out::println);
        System.out.println("===============================================");
        List<Student> sortedStudentNameByDescending = students.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .toList();
        sortedStudentNameByDescending.forEach(System.out::println);
        */
        /*
        List<Student> sortedStudentNameByAscending = students.stream()
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .toList();
        sortedStudentNameByAscending.forEach(System.out::println);
        System.out.println("===========================================");
        List<Student> sortedStudentNameByDescending = students.stream()
                .sorted((s1, s2) -> s2.getName().compareToIgnoreCase(s1.getName()))
                .toList();
        sortedStudentNameByDescending.forEach(System.out::println);
         */

//  18) Sort students by the number of activities they participate in.
//===================================================================
        /*
        List<Student> sortedStudentNameByActivities = students.stream()
                .sorted(Comparator.comparingInt(s -> s.getActivities().size()))
                .toList();
        sortedStudentNameByActivities.forEach(System.out::println);
        */

//  19) Sort students first by city and then by name.
//===================================================
        /*
        List<Student> sortedStudentNameByCityAndThanByName = students.stream()
                .sorted(Comparator.comparing(Student::getAddress).thenComparing(Student::getName))
                .toList();
        sortedStudentNameByCityAndThanByName.forEach(System.out::println);
        */

//---------------------------------------------------------------------------------------------------------------
// Advanced Stream Operations
//----------------------------------------------------------------------------------------------------------------
//  20) Find the first student whose name starts with 'A'.
//=======================================================
      /*
       Predicate<Student> studentsStartWithNameA = student -> student.getName().startsWith("A");
         students.stream()
                .filter(studentsStartWithNameA)
                .toList().forEach(System.out::println);
       */

//  21) Check if any student has "Basketball" as one of their activities.
//======================================================================
       /*
        Predicate<Student> basketball = student -> student.getActivities().contains("Basketball");
        boolean checkStudentHasBasketball = students.stream()
                .anyMatch(basketball);
        if(checkStudentHasBasketball) {
            System.out.println(students);
        }
        else {
            System.out.println("No student having basketball !");
        }
        */

//  22) Check if all students have an email address.
//==================================================
        /*
        boolean checkStudentsHavingEmail = students.stream()
                .allMatch(student -> student.getEmail() != null && !student.getEmail().isEmpty());
        if (checkStudentsHavingEmail) {
            System.out.println("All students having email");
        }else {
            System.out.println("Not all students having email");
        }
         */

//  23) Check if no student lives in "Miami".
//===========================================

        /*
        boolean checkStudentLivesInMiami = students.stream()
                .noneMatch(student -> student.getAddress().equals("Miami"));
        if (checkStudentLivesInMiami){
            System.out.println("No students live in Miami");
        }else {
            System.out.println("Some students live in Miami");
        }
        */

//  24) Get a list of students who participate in both "Cricket" and "Football".
//=============================================================================
        /*
        List<Student> studentsParticipate = students.stream()
                .filter(student -> student.getActivities().contains("Cricket") && student.getActivities().contains("Football"))
                .toList();
        studentsParticipate.forEach(System.out::println);
        */

//  25) Get the student with the longest name.
//============================================
        /*
        Optional<Student> studentWithLongestName = students.stream()
                .max(Comparator.comparingInt(student -> student.getName().length()));
        studentWithLongestName.ifPresent(System.out::println);
        */
        /*
        int longestName = students.stream()
                .mapToInt(s -> s.getName().length())
                .max()
                .orElse(0);
        List<Student> studentWithLongestName = students.stream()
                .filter(s -> s.getName().length() == longestName)
                .toList();
        studentWithLongestName.forEach(System.out::println);
        */
    }
}
