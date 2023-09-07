package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        //list : 순서가 있음, 중복된 원소 저장 가능
        //api : java.util.List = interface //<E> :리스트가 담고 있는 객체들    element
        //element는 스트링으로 ..
        List<String> list = new ArrayList<>();
        //element 얻기. element 갯수 확인 , element 있는지 확인 ..

        //element추가
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        //element 꺼내기

        //몇개의 원소가 있는지?
        int size= list.size();
        System.out.println("size= " + size);
        System.out.println("size= " + size);
        System.out.println("size= " + size);
        System.out.println(list.size());


        //꺼내기  0번 인덱스 부터



    }
}
/**/