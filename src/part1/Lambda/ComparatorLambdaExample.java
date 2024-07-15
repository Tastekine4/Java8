package part1.Lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /**
         *  prior java 8
         */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // if o1 == o2 then return 0
                // if o1 > o2 then return 1
                // if o2 > o1 then return -1
            }
        };
        System.out.println("Result of the comparator is " + comparator.compare(3, 2));


        /**
         * java 8 part1.Lambda
         */
        Comparator<Integer> comparator1 = (n, m) -> n.compareTo(m);
        System.out.println("Result of the comparator Using part1.Lambda is " + comparator1.compare(3, 2));
    }
}
