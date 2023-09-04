package ch16lambda.lecture;

public class C01lambda {
    public static void main(String[] args) {
        MyInterface01 o1 = (x, y) -> {
            System.out.println(x + y);
        };
        MyInterface01 o2 = new MyInterface01() {
            @Override
            public void method1(int x, int y) {
                System.out.println(x + y);
            }
        };
    }
}//lambda expression = f람다식
//람다를 언제 쓸까>? : 추상 메소드가 하나인 인터페이스의 객체를 만들때 사용가능하다.
interface MyInterface01 {
    void method1(int x, int y);//추상메소드를 꼭 작성해야 함

}