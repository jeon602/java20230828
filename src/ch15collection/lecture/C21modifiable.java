package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C21modifiable {
    public static void main(String[] args) {
        Map<String ,Integer> map1 = Map.of(
                "홍주", 7,
                "홍이", 10,
                "홍지", 30);

        Map<String, Integer> map2 = new HashMap<>(map1);

        map2.put("지성",13
        );


        System.out.println("map1.size() = " +  map1.size());
        System.out.println("map2.size() = " +  map2.size());
    }
}
