package ch11exception.lecture;
//9월 14일 11시 54분

public class C11polymorphism {
    public static void main(String[] args) {
        try {

        }catch (NullPointerException e){
            //동일한 예외처리 코드
        }catch (ArithmeticException e){
            //동일한 예외처리코드
        }
         try {
             // NullPointerException이 발생하든, ArithmeticException이 발생하든 상위타입의 코드로 처리 가능
         }catch (RuntimeException e){
             //여러 exception 의 상위 타입으로 한번에 잡을 수 있음
             //Object는 불가능, throwable까지만 가능.


             //동일한 예외처리코드
         }
    }
}
//NullPointerExeption = java api참고. throwable  runtimeE~ .
//상위타입
