package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
        //MyClass01.NestedClass01 o1 = new MyClass01.NestedClass01이건 불가능 인스턴스가 갖고 있는 클래스(?)
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
    }
}
class MyClass01{//마이클래스는 중첩 아님,
    class NestedClass01{}// NestedClass01 중첩 클래스
        //필드와 메소드 생성자 다 넣을 수 있다
        //MyClass01 내에서만 사용할 목적으로 만들게 됨.(필요하면 다른 클래스에서도 사용가능)
        void method1(){
            //외부클래스 내에서 사용할 때
            NestedClass01 o1 = new NestedClass01();

        }
}