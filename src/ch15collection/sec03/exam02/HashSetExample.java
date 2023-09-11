package ch15collection.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30)); //인스턴스는 다르지만 동등 객체 이므로 객체 1개만 저장한다.

        System.out.println("set.size() =" + set.size());
        for (Member s : set) {
            System.out.println("s = " + s);
        }
    }
}
