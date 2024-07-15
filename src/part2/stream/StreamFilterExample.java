package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static void main(String[] args) {
      List<Student> filteredStudents = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
              .collect(Collectors.toList());

      filteredStudents.forEach(System.out::println);
    }
}
