package part2.stream.numericstream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {


    public static int sumOfNumbers(List<Integer> list) {
        return list.stream().reduce(0, (v1, v2) -> v1 + v2); //Unboxing to convert Integer to int for each value!

    }

    public static int sumOfNumbersIntStream() {
        return IntStream.range(1,6).sum();
    }
    public static void main(String[] args) {
        // Numeric streams represents the primitive values  in a stream
        // Intstream , DoubleStream, LongStream

    List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
        System.out.println(sumOfNumbers(numList));
        System.out.println(sumOfNumbersIntStream());

        IntStream.rangeClosed(1,10).asDoubleStream().forEach(n -> System.out.println(n));

        int sum = IntStream.range(1,5).sum();

        OptionalInt maxValue = IntStream.rangeClosed(1,5).max();

        System.out.println(IntStream.rangeClosed(0,0).count());

        System.out.println(maxValue.isPresent() ? maxValue.getAsInt() : 0);

        OptionalLong optionalLong = LongStream.rangeClosed(50,100).min();

        System.out.println(optionalLong.isPresent() ? optionalLong.getAsLong() : 0);

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();

        System.out.println(optionalDouble.isPresent() ? optionalDouble : 0);


    }
}
