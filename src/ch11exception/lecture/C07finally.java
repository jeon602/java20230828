package ch11exception.lecture;
//9월 14일 11시 54분

public class C07finally {
    public static void main(String[] args) {
        System.out.println("code1");
        try {
            int j = 3 / 0;
            System.out.println("code2");
//            return;
        }catch (ArithmeticException e) {
            System.out.println("code3");
        }finally {
            System.out.println("code4");
        }
        System.out.println("code5");
        //int j = 3/0;가 발생하면 1345
        //int j = 3/3; 실행 XX 하면 ,,,124

    }//이걸로는 1345
}
