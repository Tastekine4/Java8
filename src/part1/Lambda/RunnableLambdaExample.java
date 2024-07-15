package part1.Lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * java 8 part1.Lambda
         */
        Runnable runnable1 = () -> System.out.println("Inside runnable 2");
        new Thread(runnable1).start();

        // more simple way is:

        new Thread(() -> System.out.println("Inside runnable3")).start();

        // for multiple statement or expressions use { }
        new Thread(() -> {
            System.out.println("Inside runnable 4.1");
            System.out.println("Inside runnable 4.2");
        }).start();

    }
}
