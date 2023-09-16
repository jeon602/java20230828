package ch11exception.lecture;
//9월 14일 11시 54분

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i =0;
            int j = 3/i;
            System.out.println("code2");
        }catch (ArithmeticException e) {
            e.printStackTrace();
            //api 참고 , 이 코드로 원하는 결과를 출력할 수 있음
            // e.printStackTrace 나중에 수정을 위해 사용?
//            이 코드가 실행되고 나서 , code3이 출력된다.
//            ＃표준 출력과 error 출력이 있는데, system - out~~ 이 친구가 표준출력
//            표준 출력 창은 console-//참고////
//            System.err.print 는 표준 error output stream. out 과 다른 객체를 가지므로 어느것이든 나올 ㅜㅅ 있다 (순서가 바뀔 수 있음을 의미. 참고...)
//            Systen.in.print
        }
        System.out.println("code3");
    }
}
