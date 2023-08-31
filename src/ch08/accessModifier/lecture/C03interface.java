package ch08.accessModifier.lecture;

public class C03interface {
    public static void main(String[] args){
        MyCalss03 o1 =new MyCalss03();
        o1.method1();
        o1.method2();

        MyInterface031 i1 =o1;
        MyInterface032 i2 =o1;
        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1();
        //i1.method2();불가능

        i2.method2();
        //i2.method1(); 불가능
    }
    public void method1(){
        System.out.println("C03interface.method1");
    }

}
interface MyInterface031 {
    default void method1(){
    }
}
interface MyInterface032{
    default void method2(){

    }
}
//여러 인터페이스를 구현할 수 있다
class MyCalss03 implements MyInterface031,MyInterface032 {
    public void method1(){
        System.out.println("MyCalss03.method1");
    }
    public void method2(){
        System.out.println("MyCalss03.method2");
    }

}