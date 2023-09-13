//package ch17stream.book.sec12.exam03;
//
//import ch15collection.check.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class CollectExample {
//    public static void main(String[] args) {
//        List <Student> totalList = new ArrayList<>();
//        totalList.add (new Student(90, "전ㅈ희연"));
//        totalList.add (new Student(92, "전유경"));
//        totalList.add (new Student(91, "전희연"));
//        totalList.add (new Student(98, "전희연"));
//        Map<String, Double> map = totalList.stream()
//                .collect(
//                        Collectors.groupingBy(
//                                s -> s.getSex(),
//                                Collectors.averagingDouble(s-> s.getScore())
//                        )
//                );
//        System.out.println(map);
//
//
//
//        )
//
//
//    }
//}
