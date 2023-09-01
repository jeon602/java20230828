package ch09nested.book.sec03.exam02;
//400페이지401페이지
public class AExample {
    public static void main(String[] args) {
        A.B b = new A.B();//바깥 클래스에서 사용
        //외부클래스에 인스턴스 없이 생성 가능
        System.out.println(b.field);
        b.method1();
        System.out.println(A.B.field2);//static 필드에도 연결이 가능함.
        A.B.method2();
    }
}
//※import static
//double random= Math.rendom();
//위의 Math를 import static java.lang.Math.*;로 묶음
//import static ch09nested.sec03.exam01.A.B;