package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

// Consumer can get single input but this can get (bi)2 input
// Consumer return nothing!! accept is void method
public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activity) -> {
            System.out.print("Name: " + name);
            System.out.println(" Activities: " + activity);
        };

        List<Student> list = StudentDataBase.getAllStudents();
        list.forEach(student ->
                biConsumer.accept(student.getName(), student.getActivities()));

    }

    public static void main(String[] args) {
        // Consumers does not return value ********

        BiConsumer<String, String> biConsumer = (a, b) ->
                System.out.println("a: " + a + " b: " + b);
        biConsumer.accept("Java 21", "Java 8");

        BiConsumer<Integer, Integer> multiply =
                (a, b) -> System.out.println("Multiplication: " + a * b);

        BiConsumer<Integer, Integer> division =
                (a, b) -> System.out.println("Division: " + a / b);

        multiply.andThen(division).accept(10, 5);

        nameAndActivities();
    }
}
