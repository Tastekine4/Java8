package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
       return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
               .flatMap(List::stream) // Stream<String>
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {

        System.out.println(printStudentActivities());
    }

}
