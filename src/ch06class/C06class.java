package ch06class;

public class C06class {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        System.out.println("System.identityHashCode(01) = " + args);

        System.out.println("o1.age = " + o1.age);
        o1.age = 30;

        MyClass01 o2 = o1;
        System.out.println("o2.age = "+ o2.age);
        o1.age = 60;

        System.out.println("o2.age = " + );
        //hy
//0828
    }
}

/// 변경....
class MyClass01 {
    //instance fields
    //인스턴스가 가져야 하는 속성들
    int age;

    //instance method
    //인스턴스가 가져야 하는 속성들
}