package part2.stream;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    // dont use default value when you find min max with reduce!!
    /* if u set 0 and all value in list bigger than 0 then method return 0 as min!
     Use optional instead for this */
    public static Optional<Student> getHighestGpaStudent() {

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        // a = 1 b =1 from stream => result is 1 returned
        // a =1 from returned value and b = 3 return 3
        // a = 3 and b = 5 and return 15
        // a = 15 and b =7 return 105
        Integer res1 = integers.stream().reduce(1, (c, e) -> c * e);
        System.out.println(res1);

        // Without Identity way :

        Optional<Integer> res2 = integers.stream().reduce((c, e) -> c * e);
        System.out.println(res2.isPresent());
        System.out.println(res2.get());

        // if you use optional check first with  ifPresent() then get value
        if (res2.isPresent()) {
            System.out.println(res2.get());
        }

        if (getHighestGpaStudent().isPresent()) {
            System.out.println(getHighestGpaStudent().get());
        }


    }
}
