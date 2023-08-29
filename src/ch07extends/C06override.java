package ch07extends;

public class C06override {
    public static void main(String[] args) {
        MySubClass061 o1 = new MySubClass061();
        o1.method10(); // "자식 클래스의 메소드"
    }
}
//자식 클래스의 메소드가 상위클래스의 메소드와 같은 이름을 받아야 하는데 오타가 생겼을 경우
//@override 컴파일시 재정의한 메소드인지 검증함.
class MySubClass061 extends MyClass06 {
//    @Override
    // 코드 작성!
    public void method10(){
        System.out.println("자식 클래스의 메소드");
    }
}

class MyClass06 {
    public void method10() {
        System.out.println("부모 클래스의 메소드");
    }
}
