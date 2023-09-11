package ch17stream.lecture;

import java.util.List;

//hashmap 이 아닌, 이어주다.짝을 이루다 의미의 map
public class C13map {
    public static void main(String[] args) {
        var list = List.of(3,1,2,5,7);
        list.stream()//아이템이 들어감.
                .map(x-> 10) //ㅁ무언가가 들어가서 10으로 리턴된다ㅏ x에 원소를 받아서 10으로 리턴
                .forEach(System.out::println);
        System.out.println("음수로 바꿔서 출력");
        list.stream()
                .map(x-> -x)
                .forEach(System.out::println);
        System.out.println("제곱한 값");
                list.stream()
                        .map(x-> x*x)
                        .forEach(System.out::println);




    }
}
