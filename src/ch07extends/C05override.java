package ch07extends;

public class C05override {
    public static void main(String[] args) {
    MyClass05 o1 =new MyClass05();
    o1.method1();

    MyClass051 o2 = new MyClass051();
    o2.method1();
//    o2.method2();
    }
}
class MyClass05 {
    public void method1(){
        System.out.println("어떤 기능");
    }
}

class MyClass051 extends MyClass05{
    //메소드 재정의 오버라이드
    public void method1(){
        System.out.println("변경된 기능");
    }
    public void method(){
        System.out.println("부가 기능");
    }
}