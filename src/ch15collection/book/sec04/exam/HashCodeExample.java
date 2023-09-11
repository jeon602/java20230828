package ch15collection.book.sec04.exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodeExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("호호",95);
        map.put("밍글밍글",80);
        map.put("밍글멩글",90);

        System.out.println("map.size()  = " + map.size());

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);

        System.out.println("향상된 foreach로 전체 탐색");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        map.remove("밍그링글");
        System.out.println("map.size() = "+ map.size());



    }

}
