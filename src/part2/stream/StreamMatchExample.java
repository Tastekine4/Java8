package part2.stream;

import data .StudentDataBase;

public class StreamMatchExample {

    public static void main(String[] args) {
       boolean bool1 = StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
        System.out.println(bool1);

        boolean bool2 = StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4);
        System.out.println(bool2);

        boolean bool3 = StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() <= 2);
        System.out.println(bool3);
    }
}
