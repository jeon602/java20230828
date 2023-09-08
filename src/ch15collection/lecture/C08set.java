package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();

        set.add("자바");
        set.add("kangin");
        set.add("mib jae");

        set.forEach(System.out::println);

        System.out.println("시간이 흐른 후");

        //System.out.println();
    }
}
