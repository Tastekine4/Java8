package part2.stream.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {

    // Boxing convert a primitive type to wrapper class type
    // Converting an int(primitive) type Integer (wrapper) type

     // Unboxing() Converting Wrapper class type(Integer) to primitive type(int)

    public static List<Integer> boxing() {

        return IntStream.rangeClosed(1, 10) // intstream of 10 elements
                // int here
                .boxed()
                // Integer here
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> numList) {
       return numList.stream().mapToInt(Integer::intValue)
               .sum();
    }

    public static void main(String[] args) {

        List<Integer> myList = boxing();

        System.out.println(unboxing(myList));
    }
}
