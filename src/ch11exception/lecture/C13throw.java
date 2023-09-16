package ch11exception.lecture;

public class C13throw {
    public static void main(String[] args) {
        System.out.println("main code1");

        try {
            method1();
        }catch (RuntimeException e) {
            System.out.println("예외 발생!!!!");
        }
        System.out.println("main code2");
    }


    public static void method1(){
        System.out.println("code1");            //exception을 던져 줄 수 있음 --> throw
        throw new RuntimeException(); //런타임 객체 생성 또는
        // System.out.println("Code2");
    }

    public static void method2(){
    // throw new Exception() 일단 주석 처리 , 런타임 부터
    }
}
