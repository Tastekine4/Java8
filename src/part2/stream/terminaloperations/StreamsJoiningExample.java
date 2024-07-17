package part2.stream.terminaloperations;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String stream_joining() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String stream_joining2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));

    }
        public static String stream_joining3() {
            return StudentDataBase.getAllStudents().stream()
                    .map(Student::getName)
                    .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("join1 : " + stream_joining());
        System.out.println("join2 : " + stream_joining2());
        System.out.println("join3 : " + stream_joining3());
    }
}
