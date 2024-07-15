package part1.Lambda.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    // Unary operator gets same type input and output! the only difference is this.
    // in this kind of scenarios you can use UnaryOperator instead of Function
    static UnaryOperator<String> unaryOperator=  s -> s.concat("default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java8 "));
    }
}
