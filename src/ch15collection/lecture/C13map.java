package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        //map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("학생 1", "흥민");
        map.put("학생 2", "유정");
        map.put("학생 3", "민희");


        //향상된 for로 전체 탐색
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for(Map.Entry<String,String>entry : entries){
            System.out.println(entry.getKey() + ":"  + entry.getValue());
        }

        //keyset으로 전체 탐색하는 방법
        System.out.println("keyset으로 전체 탐색");
        //map 에서 key들을 얻어온다  keyset == Set<K>
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + ": " + map.get(key));
        }
        //foreach
        System.out.println("foreach로 메소드 전체탐색");
        //익명객체 클래스로부터
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String k, String v) {
                System.out.println(k + ":" + v );
                map.forEach((key, value) -> System.out.println());
            }
        });//여기 까지 익명클래스 객체를 만든 것 ㅣㅣ 람다로  alt+enter

        // map. entry entrySet은
    }
}
