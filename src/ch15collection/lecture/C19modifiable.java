package ch15collection.lecture;

import ch08.book.sec03.A;

import java.util.ArrayList;
import java.util.List;

public class C19modifiable {
    public static void main(String[] args) {
        List<String> list1 = List.of("html ","java");


        List<String >list2 = new ArrayList<>(list1);

        //그러면 윙[ 새로운 객체를 생성하여 바꿔줁다

        list1.add ("java");
//      set interface 상위 인터페이스로 hashmap 객체 생성 가능

        System.out.println("list1.sicze" +list1.size());

        System.out.println("프로그램  실행 중");
    }
}
