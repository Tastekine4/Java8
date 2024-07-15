package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList() {
       return StudentDataBase.getAllStudents().stream()
                // transform student to studentName
                .map(Student::getName)
               // uppercase operation for each input
               .map(String::toUpperCase)
               .collect(Collectors.toList());
    };
    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
