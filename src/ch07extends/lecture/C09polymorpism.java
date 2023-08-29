package ch07extends.lecture;

import org.w3c.dom.ls.LSOutput;

public class C09polymorpism {
    public static void main(String[] args) {
        MyClass09 o1 = new MySubClass091(); //091로 인스턴스 만들기
        MyClass09 o2 = o1; //ok

        //String o3 = o1;
        //MyClass09 04 = o1;
        MyClass09 o3 = new MyClass09();


        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(o2));
        System.out.println(System.identityHashCode(o3));

        o1.method1(); //변수의 타입과 관계없이 실제 인스턴스의 메소드가 실행
        o2.method1();//실제 인스턴스의 메소드 실행
        o3.method1();
    }
}
class MyClass09{//메소드 재정의
   void method1(){
       System.out.println("부모 메소드");
   }

}
class MySubClass091 extends MyClass09{

}