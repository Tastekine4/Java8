package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("adam", "dan", "jenny");
        names.stream(); // creates a stream

        //Stream operations can be performed either sequentially ir parallel
        // names.parallelStream();

        Map<String, List<String>> infoMap =
                StudentDataBase.getAllStudents().stream()
                        .filter(n -> n.getGradeLevel() >= 3)
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));
        // collect is a terminal operation it means this all pipeline run if code executed like collect method
        System.out.println(infoMap);
    }
}
