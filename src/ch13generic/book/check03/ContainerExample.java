/*package ch13generic.book.check03;


import ch08.book.sec03.C;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동","도적");
        String name1 = container1.getkey();
        String job = container1.getValue();

        Container<String, Integer> container2 = new Container<String,Integer>();
        container2.set("홍길동",35);
        String name2 = container2.getKey();
        int age = container2.getValue();

    }
}*/
/*
class MyClass<K,V> {
    private   K field1;
    private   V field2;

    public void setField1(K field1) {
        this.field1 = field1;
    }
    public K getField1(K field1){
        this.field1= field1;
        return field1;
    }
}*/
/*package ch13generic.book.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.get();

    }
}

=====================================================
package ch13generic.book.exercise.p02;

public class Container<T> {
    private T field;
    public void set(T p) {
        this.field = p;
    }

    public T get() {
        return field;
    }
}

*/