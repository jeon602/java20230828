package ch11exception.lecture;

public class C18throws {
    public static void main(String[] args)throws ClassCastException {
    method1();
    //exception 발생하는 메소드 또는 생성자 사용시 try- catch로 처리 또는 메소드에 throws로 명시
    }

    public static void method1() throws ArithmeticException{}
}
