package ch17stream.lecture;

import java.util.List;
//stream의 중간 연산 filter : pridicate라는 객체를 갖는데 이는 function~이고
public class C12filter {
    public static void main(String[] args) {
        var list = List.of(3,1,4,9,10,33,2);

         list.stream()
                 .filter(e -> e %2 ==0)//짝수만 스트림으로 하겠다
                 .forEach(System.out::println);
        System.out.println("짝수 중에 가장 작은 값 출력");
        list.stream()
                .filter(e-> e %2 ==0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수 중 가장 큰 값 출력");
        list.stream()
                .filter(e -> e %2 == 1)//홀수 나오게 함 + sorted와 중간 연산이므로 이 둘은 순서가 바뀌어도 상관 없음
                .sorted((x,y)->y-x)//정렬하고
                .limit(1) //뭘 하든  maxsize 갯수만큼만 출력
                .forEach(System.out::println);

    }
}
