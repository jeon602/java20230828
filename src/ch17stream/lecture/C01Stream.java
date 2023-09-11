package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

//722페이지 17장 스트림
//달라져있는 element들을 정리해주는 stream
//list 컬렉션에 담겨있는 요소를 하나씩 처리하는 for문을 의미함.
//stream은 람다와=======
public class C01Stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","spring", "css", "react");
        for(String item : list){
            System.out.println("item= " + item);
        }
        //list api 참고.. 보면 stream이라는 메소드가 존재한다

        Stream<String> stream = list.stream();
        //stream api 참고 stream이라는 interface에 여러가지 메소드가 존재하는데, 2가지 유형으로 나눌 수 있다.
        //중간연산과 최종연산으로 ..
        //api-> 어떻게 아는지>>? 예로 count 메소드를 선택했다=== terminal : 최종연산 메소드
        //distinct메소드는  중간 연산
 //        intermediater중간연산. ---------------intermdiate operation
        stream.limit(5);//중간연산은 중간에 여러번 사용 가능
        //최종연산 후 stream재사용 불가함.
        stream.count();//최종연산은  마지막 한 번만 사용가능함
        //중간과 최종연산이 같이 작성되는데 최종연삭시 중간연산을 같이 처리함.
        //api:: Stream is lazy
    }
}
