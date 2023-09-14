package ch11exception.book.sec06;

public class InsufficientException extends Exception {//일단 예외로 선언
    public InsufficientException(){

    }
    public InsufficientException(String message){ //두 개의 생성자 선언
        super(message);
    }
}
