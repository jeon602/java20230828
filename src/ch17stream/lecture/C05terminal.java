package ch17stream.lecture;

import java.util.List;

public class C05terminal {
    public static void main(String[] args) {
        List<String> list = List.of("css","html","spring");
        long stream =list.stream()
                .count(); //스트림에 몇 개인지.//
//        String count;
//        System.out.println("count = " + count);list
    }
}
