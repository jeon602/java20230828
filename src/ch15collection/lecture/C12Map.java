package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12Map {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        //put entry의 추가 메소드
        map.put("student1", "전희연");
        map.put("student2", "전지은");
        map.put("student3", "전유경");

        //size: entry 의 갯수 확인
        System.out.println("map.size() = " + map.size());

        /* entry 교체 메소드 */
        map.put("student2", "전부경");

        //entry 삭제 메소드
        map.remove("student2"); //둘로 오버로딩 된다. api 참고

        //entry의 value를 얻는 메소드
        String s= map.get("student1");
        System.out.println("s = " + s);
        System.out.println("map.get(\"student1\") = " + map.get("student1"));
        System.out.println("map.get(\"student2\") = " + map.get("student2"));
    }
}
    //Map의 키는 중복 저장이 안된다,. --> <"Student"."minji">
    //Map의 키는 중복 저장이 안된다,. --> <"Student"."gong"> student 라는 키를 중복 저장할 수 없다.
    //Map : key, value 쌍(entry)를 저장한다. ※key는 중복된 entry를 저장할 수 없다.

    //map 타입의 인스턴스를 만들어야 하는데 못 만 드니까 Map<> dms hash map 사용
    //entry 추가 메소드: put 2개의 파라미터 갖는다
