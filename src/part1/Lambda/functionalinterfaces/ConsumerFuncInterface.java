package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFuncInterface {

    // Consumer return nothing!! accept is void method

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("Java 8");
        printName();
        System.out.println("---- Second Method ---");
        printNameAndActivities();
        System.out.println("---- Third Method ---");
        printNameAndActivitiesWithCond();
    }

    public static void printName() {
        Consumer<Student> consumer = n -> System.out.println(n);
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(n -> System.out.println(n));

        studentList.forEach(consumer);
    }

    public static void printNameAndActivities() {
        Consumer<Student> consumer1 = student ->
                System.out.print("Student Name: " + student.getName());
        Consumer<Student> consumer2 =
                (student) -> System.out.println(" Activities: " + student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        // consumer chaining (andThen)
        studentList.forEach(consumer1.andThen(consumer2));
    }

    public static void printNameAndActivitiesWithCond() {
        Consumer<Student> consumer1 = student ->
                System.out.print("Student Name: " + student.getName());
        Consumer<Student> consumer2 =
                (student) -> System.out.println(" Activities: " + student.getActivities());

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                consumer1.andThen(consumer2).accept(student);
            }
        });
    }
}
