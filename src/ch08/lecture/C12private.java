package ch08.lecture;
//private 메소드가 필요한 이유.. //someFeature
public class C12private {
}
interface MyInterface12{
    default void method1(){
        System.out.println("1");
        System.out.println("2");
    }
    default void method2(){
        someFeature();
        System.out.println("3");
    }
   private void someFeature(){
        //private instance 메소드

        System.out.println("4s");
    }
}
