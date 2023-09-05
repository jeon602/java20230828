package ch12api.book.check05;

import ch12api.book.sec03.exam02.HashCodeExample;

import java.util.HashSet;

public class StudentExample {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));


        System.out.println("저장된 Studdent 수: " + hashSet.size() );
    }
}
