package ch11exception.lecture;
//9월 14일 11시 54분

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 1;
            int j = 3/i;
            System.out.println("code2");
        } catch (ArithmeticException e){
            System.out.println("code3");
        }finally {
            //finally block은 exception과 관계없이 실행되는 block이다
            //finallu block 예외 처리 와는 관계어뵤이 실행되는 block.
            System.out.println("꼭 실행코드!! ");
        }

    System.out.println("code4");
    }
}
