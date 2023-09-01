package ch09nested.book.sec04.exam03;
//405페이지

public class A {
    public void method1(int arg){ //final int arg
        //로컬변수
        int var = 1; //final int var = 1;

        //로컬 클래스
        class B{
            //메소드
            void method2(){
                //로컬 변수 읽어내기
                System.out.println("arg:" + arg);
                System.out.println("var:" + var);

                //로컬 변수 수정
                //arg = 2;
                //var = 2;
            }
        }

        B b= new B();//로컬 객체 생성
        b.method2();//로컬 객체 메소드 호출

        //로컬 변수 수정
        //arg=3;
        //var=3;

    }
}
