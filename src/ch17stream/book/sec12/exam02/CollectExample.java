//package ch17stream.book.sec12.exam02;
//
//import ch15collection.check.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class CollectExample { public static void main(String[] args) {
//        List<Student> totalList = new ArrayList<>();
//        totalList.add(new Student("남자","홍길동",92));
//        totalList.add(new Student("김수영","여자",89));
//        totalList.add(new Student("홍길동","남자",95));
//        totalList.add(new Student("오해영","여자",93));
//
//        Map<String, List<Student>> map = totalList.stream()
//                .collect(
//                        Collectors.groupingBy(s-> s.getSex()));
//        map.get<"남">
//            .forech
//        List<Student> maleList = map.get("남");
//        maleList.stream().forEach(s-> System.out.println(s.getName()));
//
//
//
//
//    }
//}
