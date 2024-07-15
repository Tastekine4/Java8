package part1.Lambda.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        // We can reuse them when we create variable for it like this.
        Predicate<Integer> p1 = i -> i % 2 == 0;
        System.out.println(p1.test(4));

        System.out.println("Method 2: ");
        predicateAnd();
        System.out.println("Method 3: ");
        predicateOr();

        System.out.println("Method 3: ");
        predicateNegate();
    }

    public static void predicateAnd() {
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i % 5 == 0;

        System.out.println(p1.and(p2).test(10)); // predicate chaining
    }

    public static void predicateOr() {
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i % 5 == 0;

        System.out.println(p1.or(p2).test(8)); // predicate chaining
    }

    public static void predicateNegate() {
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i % 5 == 0;
        //Negate reverse the result of this conditions like (!)
        System.out.println(p1.or(p2).negate().test(8)); // predicate chaining
    }

}
