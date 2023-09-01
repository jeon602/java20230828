package ch08.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); //public static 메소드 실행. static은 인스턴스 생성 없이 가능
    }
}
interface MyInterface14{
    //필드 : public static final

    //static메소드 = 정적 메소드
    //public static과 private static
    static void method(){
        //public static 메소드다.
        System.out.println("MyInterface14.method");
    }
    static void method2(){
        System.out.println("MyInterface14.method2");
        common();
//        System.out.println("기능");
    }
    private static void common() {
        System.out.println("기능"); //이걸 공개하고 싶지 않으니 private로 정의내려준다
    }
}