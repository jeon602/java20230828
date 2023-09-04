package ch09nested.lecture;

public class C11 {
    public static void main(String[] args) {
        MyInterface11 o2 = new Myclass111();
        MyInterface11 o3 = new MyInterface11() {
            public void method1() {
                System.out.println("C11.method1");
            }
        };
        MyInterface11.method1();
    }
}

class Myclass111 implements MyInterface11 {
    public void method1() {
        System.out.println("Myclass111.method1");
    }
}

interface MyInterface11 {
    static void method1() {
        System.out.println("MyInterface11.method1");
    }
}
