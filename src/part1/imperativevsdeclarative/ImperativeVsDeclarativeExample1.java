package part1.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {


    public static void main(String[] args) {
        /*
         * Imperative - how style of programming
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum using Imperative Approach : " + sum);


        /*
         * Declarative Style of Programming - What style of programming
         */
        // sum1 here immutable and it is easy do use multi thread this approach
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum Using Declarative Approach: " + sum1);
    }


}
