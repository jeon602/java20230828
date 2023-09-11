package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiable {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("java","spring","react");
        Set<String> set2 = new HashSet<>(set1);

        set2.add("html");
        System.out.println("Set.size()" + set1.size() );
        System.out.println("Set.size()" + set2.size() );
        System.out.println("Set.size()" + set1.size() );
    }
}
