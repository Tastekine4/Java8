package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {


    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {
            if (p1.test(s)) {
                System.out.println(s);
            }
        });

    }
}
