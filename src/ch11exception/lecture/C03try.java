package ch11exception.lecture;
//9월 14일 9시 53분
public class C03try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");


        try {
            //try block : exception이 발생할 수 있는 코드
            int i = 0;
            int j =3/i; //arithmetic exception
            //exception이 발생할 것 같은 코드를 try안에
            //            +생성된 객체를 잡겠다.
        } catch (ArithmeticException e) {
            //       catch block     발생한 exception 객체를 잡은 후 실행하는 코드
        System.out.println("exception 발생 시 실행되는 코드1");
        System.out.println("exception 발생 시 실행되는 코드2");
        }
        //exception이 발생하지 않은 것은 아님.
        System.out.println("code3");
    }
}
