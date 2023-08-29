package ch07extends.lecture;

public class C01extends {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        o1.age= 33;
        o1.method1();

        MySubClass011 o2 = new MySubClass011();
        o2.age = 44;
        o2.method1();
    }
}
//MyClass01의 멤버 (필드와 메소드)를 상속함
class MySubClass011 extends MyClass01{
//    int age;
//    void method1(){
//        System.out.println();
//    }
}
class MyClass01{
    int age;

    void method1(){
        System.out.println("MyClass01. method1");
    }
}