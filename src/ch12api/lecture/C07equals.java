package ch12api.lecture;

import java.util.Objects;

public class C07equals {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07("박지성");
        MyClass07 o2 = new MyClass07("박지성");

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
    }
}
class MyClass07 {
    private String name;

    public MyClass07(String name){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        MyClass07 o = (MyClass07) obj;
        return super.equals(obj);
    }
}