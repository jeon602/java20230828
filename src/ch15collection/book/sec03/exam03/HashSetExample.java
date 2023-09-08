package ch15collection.book.sec03.exam03;
//9월 11일  오전 첫 시간, 리뷰와 해석
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        //HashSet 컬랙션 생성
        Set<String> set = new HashSet<String>();
        //객체 추가
        set.add("Java");
        set.add("JSP");
        set.add("JDBC");
        set.add("Spring");
        //객체를 하나씩 가져와서 처리한다.
        Iterator<String> iterator= set.iterator();
        //객체를 하나 가져오기
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
            if(element.equals("JSP")){
                iterator.remove(); //가져온 객체를 컬렉션에서 제거하기
            }
        }
        System.out.println();


        set.remove("JDBC");//객체 제거

        //객체를 하나씩 가져와서 처ㅣ함
        for (String element : set ){
            System.out.println(element);
        }
    }
}

//Java
//JSP
//JDBC
//Spring
//
//Java
//Spring
