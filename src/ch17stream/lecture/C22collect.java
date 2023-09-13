package ch17stream.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class C22collect {
    public static void main(String[] args) {
//        List /set/ map으로 모은다

        List<String> list = List.of("java","spring", "css","html");

        List<Integer> res1 = new ArrayList<>();
        for(String str : list){
            res1.add(str.length());
        }
        System.out.println("res1 = " + res1);

        List<Integer> res2 = list.stream()
                .map(String::length)
                .collect(Collectors.toList()); //최종연산이다. list에 만들어 주고 싶다

        System.out.println("res2 = " + res2);


        Set<Integer> res3= list.stream()
                .map(String::length)
                .collect(Collectors.toSet());
        System.out.println("res3 =" +res3);

        //toMap의 사용 fumction
        list.stream()
                .collect(Collectors.toMap(x->x, String::length));

        String collect = null;
        System.out.println("collect = " + collect);

    }

}
