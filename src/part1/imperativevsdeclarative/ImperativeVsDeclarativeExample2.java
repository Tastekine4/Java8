package part1.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        /*
         * Imperative Approach
         */
        List<Integer> uniqList = new ArrayList<>();
        for (Integer val : integerList) {
            if (!uniqList.contains(val)) {
                uniqList.add(val);
            }
        }
        System.out.println("UniqueList: " + uniqList);

        /*
         * Declarative Approach
         */
        List<Integer> uniqListStream = integerList.stream()
                .distinct().collect(Collectors.toList());
        System.out.println("UniqueList: " + uniqListStream);
    }
}
