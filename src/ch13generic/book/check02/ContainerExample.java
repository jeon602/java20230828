package ch13generic.book.check02;

import java.awt.*;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.getField();

        Container<Integer> container2 = new Container<Integer>();
        container2.set(6);
        int value = container2.getField();
    }
}
class Container<T> {
    private T field;

    public void set(T field){
        this.field = field;
    }
    public void get(T field){
        this.field = field;
    }
    public T getField(){
        return field;
    }
}