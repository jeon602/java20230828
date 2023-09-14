package ch11exception.book.sec02.exam02;
//9월 14일 9시 53분
public class ExaceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");//classNotFoundException발생 가능 코드
            System.out.println("java.lang.String클래스가 존재합니다. ");
        }catch (ClassNotFoundException e ){
            e.printStackTrace();
        }
        System.out.println();
        try {
            Class.forName("java.lang.String2"); //classNotFoundException발생 가능 코드
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("실행 흐름 이어감");
    }
    /*일반 예외 ---> classNotFoundException
        클래스의 forname
         e.printStackTrace();---->처음 보는 method




         excaption이 발생하면 , catch잡고, */
}
