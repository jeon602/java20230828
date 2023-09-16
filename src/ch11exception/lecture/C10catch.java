package ch11exception.lecture;
//9월 14일 11시 54분 여러 exception처리 하는 catch

import ch08.book.sec03.C;

public class C10catch {
    public static void main(String[] args) {
        try {
            //exception 발생 가능 코드 ,
        }catch (ArrayIndexOutOfBoundsException e){
            //exception을 처리하는 코드
        }catch (NumberFormatException e ){
            //exception 처리 코드
        }

        try {

        }catch (NullPointerException | ClassCastException |NumberFormatException e) {
            //exception 타입을 처리 할 수 있다 - 여러 타입의 코드를 e-->객체의 타입
        }
    }
}
