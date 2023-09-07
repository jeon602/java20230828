package ch13generic.lecture;

import java.util.HashMap;

public class C05generic {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        MyClass05<String,Integer> o1 = new MyClass05<>();
        MyClass05<Integer,String> o2 = new MyClass05<>();

    }
}
class MyClass05<T,U> {
    private T field1;
    private U field2;
    //각자 T와 U에 다른 값 지정 가능


    public T getField1(){
        return  field1;
    }
}
