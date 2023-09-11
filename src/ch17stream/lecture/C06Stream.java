package ch17stream.lecture;

import java.util.List;

//foreach method : 컨슈머 타입의 객체를 받는다. consumer=function interface 이므로 람다식 사용 가능
public class C06Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,10,9,2);
        list.stream()
                .forEach(System.out::println);

    }
}
