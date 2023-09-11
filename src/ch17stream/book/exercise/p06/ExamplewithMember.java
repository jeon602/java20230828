//package ch17stream.book.exercise.p06;
//
//import ch17stream.book.Member;
//
//import java.util.List;
//
//public class Example {
//    public static void main(String[] args) {
//        var list = List.of(
//                new Member("홍길동", 30),
//                new Member("신용권", 40),
//                new Member("감자바", 26)
//        );
//
//        list.stream()
//                .map(m -> m.getAge())
//                .forEach(System.out::println);
//
//        System.out.println("나이들의 합을 reduce로 구해서 츌력하라");
//        Integer sum =list.stream()
//                .map(m-> m.getAge())
//                .reduce(0,Integer::sum);
//
//        System.out.println("sum = " + sum);
////        Integer
//        //
//        System.out.println("가장 많은 나이 reduce로 구해서 출력하시오");
//        Integer maxAge = list.stream()
//                .map(m-> m.getAge())
//                .reduce(Integer.MIN_VALUE,Math);
//
//        //
//        System.out.println("가장 작은 나이 reduce로 구해서 출력하시오");
//
//
//
//
//
//    }
//
//}
