package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {
    public static void main(String[] args) {

        BiPredicate<Integer, Double> biPredicate =
                (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
        BiConsumer<String, List<String>> studentBiConsumer =
                (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<Student> studentConsumer = student -> {
            if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
                studentBiConsumer.accept(student.getName(), student.getActivities());
            }
        };

        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(studentConsumer);
    }
}
