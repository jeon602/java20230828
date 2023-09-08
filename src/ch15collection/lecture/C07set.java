package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        //set: 객체(item, element ,원소, 요소)를 담고 있는 객체
        //특징: 중복된 element를 저장하지 않는다.

        Set<String> set1 = new HashSet<>();
        //set이든 hashset이든,
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java");

        //size는 원소의 갯수
        System.out.println(set1.size());//사이즈는 3이 된다 왜? 중복저장이 불가능하므로.
    //contains : 있는지 확인

        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        //remove : 삭제
        set1.remove("java");
        set1.remove("html");
        System.out.println(set1.size());

        //T코드와 api확인하기 ----------------

        //of:
        Set<String> set2 = Set.of("css", "react", "html");
        //set2.add("java"); //exception/
        //전체 탐색하는 방법 = 향상된  for 문을 이용한다.
        System.out.println("향상된 for문 사용해서 전체 탐색 ");
        for(String str : set2){
            System.out.println(str);
        }
    //foreach
        System.out.println("foreach 로 전체 탐색");
        set2.forEach(item-> System.out.println(item));
        //메소드 참조
        set2.forEach(System.out::println);
    }
}
