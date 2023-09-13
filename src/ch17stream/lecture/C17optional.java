package ch17stream.lecture;

import java.util.List;
import java.util.Optional;

public class C17optional {
    public static void main(String[] args) {
        List<Integer>list = List.of(2,3);
        Optional<Integer> sum = list.stream()
                .reduce(Integer::sum);

//        sum.get(); //exception
//        System.out.println("program....");

        System.out.println("sum.orElse(0) = " + sum.orElse(0));

    }
}
