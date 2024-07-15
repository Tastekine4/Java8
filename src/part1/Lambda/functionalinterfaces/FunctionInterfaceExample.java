package part1.Lambda.functionalinterfaces;

import java.util.function.Function;

public class FunctionInterfaceExample {


    // First one is input String and second one is return type which is String
    static Function<String, String> function = (name) -> name.toUpperCase();

    public static void main(String[] args) {
        System.out.println(function.apply("Java8"));
    }

}
