package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistrincCountSortExample {

    // distinct returns a stream with a unique elements
    // count returns a long with the total number of elements in a stream
    // sort the elements in the stream

    public static List<String> printStudentActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .collect(Collectors.toList());
    }
    public static long getStudentActivitiesCount() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .count();
    }

    public static List<String> getStudentActivitiesAlphabeticOrder() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream) // Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(printStudentActivities());

        System.out.println(getStudentActivitiesCount());

        System.out.println(getStudentActivitiesAlphabeticOrder());
    }

}
