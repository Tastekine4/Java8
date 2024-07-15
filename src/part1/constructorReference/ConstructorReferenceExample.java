package part1.constructorReference;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    // called class should have empty constructor !!!

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = Student::new;

        System.out.println(studentSupplier.get());

        Function<String, Student> f1 = Student::new;

        System.out.println(f1.apply("Erhan"));
    }
}
