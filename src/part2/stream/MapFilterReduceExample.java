package part2.stream;

import data.Student;
import data.StudentDataBase;

public class MapFilterReduceExample {

    public static void main(String[] args) {

        int res = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter(s -> s.getGradeLevel() >= 3)
                .filter(s -> s.getGender().equals("female"))
                .map(Student::getNoteBooks)// map convert Stream<Student> type to Stream<Integer>
                // alternative way for reduce sum
                // .reduce(0, (s1, s2) -> s1 + s2);
                .reduce(0, Integer::sum);
        System.out.println(res);
    }
}
