package ch11exception.lecture;
//9월 14일 9시 53분
public class C04trt {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");
        try {
            int i = 3;//int i = 3;--code1code2 code3code4code5
            int j =3/ i;
            System.out.println("code3");
            System.out.println("code4");//3과 4는 실행 XX
        }catch (ArithmeticException e ){
            System.out.println("exceptioncode1");
            System.out.println("exceptioncode2");
        }


        System.out.println("code5");
    }
}
