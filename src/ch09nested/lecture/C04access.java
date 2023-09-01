package ch09nested.lecture;

public class C04access {
    //※ p.207참고※ 기본은 static member는 instance member에 접근 할 수 없다.
    // instance는 static member에 접근 가능
    //외부 클래스에 인스턴스 필드와 스태틱 필드 존재
    int instanceField;

    static int staticField;

    static class StaticNestrdclass{
        void method1(){
            System.out.println(staticField);
//            System.out.println(instanceField);는 불가능 하다.
        }
    }

    class InnerClass{
        void method1(){
            System.out.println(instanceField);
            System.out.println(staticField);
        }

    }

}
