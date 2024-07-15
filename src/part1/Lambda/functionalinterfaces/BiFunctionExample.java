package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    // Bi-function first two are inputs and third parameter is return type
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (students, studentPredicate) -> {
                Map<String, Double> studentInfoMap = new HashMap<>();
                students.forEach(student -> {
                    if (studentPredicate.test(student)) {
                        studentInfoMap.put(student.getName(), student.getGpa());
                    }
                });
                return studentInfoMap;
            };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
    }
}
