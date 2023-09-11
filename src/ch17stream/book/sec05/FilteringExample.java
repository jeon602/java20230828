package ch17stream.book.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("전지은");  list.add("조윤정");
        list.add ("전희연"); list.add("김민율"); list.add("조윤정");

        list.stream()
                .distinct()
                .forEach(n-> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n-> n.startsWith("전"))
                .forEach(n->System.out.println(n));
        System.out.println();

        list.stream()

                .distinct()
                .filter(n-> n.startsWith("전"))
                .forEach(n-> System.out.println(n));


    }
}
