package part2.stream.terminaloperations;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class StreamsMappingExample {


    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(nameList);

        Set<String> uniqNameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        // Collectors.mapping help us to write this in a single line additional operation.
        // StudentDataBase.getAllStudents().stream().map(Student::getName)
        //                .collect(Collectors.toList()));
        System.out.println(uniqNameList);
    }
}
