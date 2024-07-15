package part1.Lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i = 0;
        // i was declared in the upper so cant use it in lambda expression
        Consumer<Integer> c1 = i1 -> System.out.println(i1);
    }
}
