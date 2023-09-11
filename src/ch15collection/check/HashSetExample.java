package ch15collection.check;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "홍길모"));
        set.add(new Student(3, "홍길세모"));

        System.out.println("저장된 객체 수: " + set.size());
        for (Student s : set){
            System.out.println(s.studentNum + " : " + s.name);
        }
    }
}
