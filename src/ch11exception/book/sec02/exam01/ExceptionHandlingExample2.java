package ch11exception.book.sec02.exam01;
//오전 10:27 2023-09-14
public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); //----> 데이터가 null일 경우 NullPointException 가 발생한다.
            System.out.println("문자 수: " + result); //---> 예외 정보를 얻는 방법
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
