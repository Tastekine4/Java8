package part1.methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceExample {

    /**
     *  ClassName::instance-methodName
     *  ClassName::static-methodName
     *  instance::methodName
     */

    public static void main(String[] args) {
        // Using part1.Lambda
        Function<String,String> toUpperCaseLambda = s-> s.toUpperCase();

        // Using Method reference:
        Function<String,String> toUpperCaseMethodRef = String::toUpperCase;


        // Using part1.Lambda for Consumer
        Consumer<Student> c1 = student -> System.out.println(student);
        StudentDataBase.getAllStudents().forEach(c1);

        // Method Reference version:
        Consumer<Student> c2 = System.out::println;
        StudentDataBase.getAllStudents().forEach(c2);

        /**
         * ClassName::instanceMethodName
         */
        Consumer<Student> activites = Student::printListOfActivities;
        StudentDataBase.getAllStudents().forEach(activites);
    }

}
