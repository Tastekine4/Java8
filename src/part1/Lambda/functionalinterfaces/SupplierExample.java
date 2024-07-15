package part1.Lambda.functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    // opposite of Consumer this return something


    public static void main(String[] args) {
        Supplier<Student> supplier = () -> {
            return new Student("Erhan", 2, 3.6, "male",
                    Arrays.asList("swimming", "basketball", "volleyball"));
        };

        System.out.println("Student is : " + supplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println(listSupplier.get());
    }
}
