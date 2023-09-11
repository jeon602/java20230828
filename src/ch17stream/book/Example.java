package ch17stream.book;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a java book",
                "Lamda Expressions",
                "Java8 supports lamda expressions"
        );
        System.out.println("고전적인 for문 사용");
        for(String item : list){
            if(item.toLowerCase().matches(".*java*")){
                System.out.println(item);
            }
        }

        System.out.println("Stream 사용");
        list.stream()
                .filter(n-> n.startsWith(".*java.*"))
                .forEach(System.out::println);

    }
}
/*강사님 코드 github
* package ch17stream.book.sec05.exercise.p05;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );

        System.out.println("고전적인 for 사용");
        for (String item : list) {
            if (item.toLowerCase().matches(".*java.*")) {
                System.out.println(item);
            }
        }

        System.out.println("stream 사용");
        list.stream()
                .filter(e -> e.toLowerCase().matches(".*java.*"))
                .forEach(System.out::println);

        System.out.println("contain 사용");
        list.stream()
                .filter(e -> e.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println("indexOf 사용");
        list.stream()
                .filter(s -> s.toUpperCase().indexOf("JAVA") != -1)
                .forEach(System.out::println);
    }

}
*/