package part1.Lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int sum = 10;

    public static void main(String[] args) {
        int value = 4; // local variable

        Consumer<Integer> c1 = i -> {
          //  value++  this give error because value is local variable but
            sum ++;  // this works fine because it is instance variable !!!
            System.out.println(value + i);
            System.out.println(sum);
        };
        c1.accept(4);

        // part1.Lambda's allowed to use local variables but not allowed to modify them
        // even they are not declared as final.

    }
}
