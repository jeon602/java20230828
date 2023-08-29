package ch07extends.book.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        child.method1();
        child.method2();
        child.method3();



        Parant parant = child;

        parant.method1();
        parant.method2();
    }
}
