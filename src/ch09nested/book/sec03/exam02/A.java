package ch09nested.book.sec03.exam02;
//400,401페이지
public class A {
    static class B{//중첩 클래스 생성 가능+ 필드.생성자.메소드 사용가능

        //public boolean field1;
        int field =1;

        static int field2=2;

        B(){
            System.out.println("B-생성자 실행");
        }
        void method1(){//메소드
            System.out.println("B-method1 실행");
        }
        static void method2(){//static method 
            System.out.println("B-method2 실행");
        }
    }

}
