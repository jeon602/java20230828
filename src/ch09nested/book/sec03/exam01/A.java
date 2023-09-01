package ch09nested.book.sec03.exam01;

public class A {
    static class B{}

    B field1 =new B();

    static B field2 = new B();

    A(){
        B b=new B();
    }
    void method1(){
        B b =new B();
    }
    static void method2(){
        B b=new B();
    }
}
//A클래스 외부에서 B객체를 생성하려면 A 객체 생성없이 A클래스로 접근해서B객체를 생성할 수 있다