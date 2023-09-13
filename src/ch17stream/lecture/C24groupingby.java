package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//groupingBy - collector ---- 리턴하는 타입이다.
//collect method가 R 이 리턴타입으로 사용된다,
//groupingby의 리턴타입이 map<>타입   k .
//
//리턴타입이 map인데 k가 list.
public class C24groupingby {
    public static void main(String[] args) {
        List<String> list = List.of(
                "자바", "스프링","css","html", "react", "vue",
                "jquery", "jsp"
        );
//        3~6글자로 분류하고 싶으면
    Map<Integer, List<String>> collect = list.stream()
            .collect(Collectors.groupingBy(String::length));
    collect.entrySet().stream()
            .forEach(e-> System.out.println(e.getKey()+ ":" + e.getValue()));
    }
}
