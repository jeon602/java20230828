package ch09nested.book.sec04.exam01;
//402페이지
public class A {
    A(){
        class B{}
        B b = new B();
        //로컬 객체 생성
    }

    void  method(){
        class B{}

        B b = new B();
    }
}
