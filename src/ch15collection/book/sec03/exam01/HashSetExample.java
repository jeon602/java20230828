package ch15collection.book.sec03.exam01;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //
        Set<String> set = new HashSet<String>();
        //HashSet collection 생성
        //객체 저장

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); //중복 객체이므로 저장하지 않는다.
        set.add("Spring");
//      저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}
