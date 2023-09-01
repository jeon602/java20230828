package ch09nested.book.sec02.exam01;
//395396페이지
public class A {
    class B{}//인스턴스 멤버 클래스

    B field = new B();//인스턴스 필드 값으로 B 객체 대입

    A(){//생성자
        B b =new B();
    }

    void mrthod(){
        //인스턴스 메소드
        B b =new B();
    }
}



//B객체는