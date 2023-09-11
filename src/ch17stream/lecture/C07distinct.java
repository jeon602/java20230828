package ch17stream.lecture;

import java.util.List;
//중복 제거 스트림에 존재하는 element들을 제거한다.
public class C07distinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,7,2,1,3,6);
        long count = list.stream()
                .distinct()
                .count();

        System.out.println("count = " + count);
    }
}
