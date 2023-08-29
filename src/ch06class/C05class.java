package ch06class;

public class C05class {
    public static void main(String[] args) {
        MyClass05 o1 = new MyClass05(); //new 연산자.
        MyClass05 o2 = new MyClass05();
        System.out.println("o1의 참조값"+ System.identityHashCode(o1));
//        System.out.println("o2의 참조값"+ System.identityHashCode(o2));

        o1.age= 30;
        o1.model= "java";
        MyClass05.model = "spring";



        System.out.println("o1.age  = " + o1.age);//30
        System.out.println("o2.age  = " + o2.age);//0
        System.out.println("o1.model  = " + o1.model); //java
        System.out.println("o2.model = " + o2.model);//java


    }
}
class MyClass05 {
    //속성이 작성될 수 있도록
    int age; //instance field
    static String model; //클래스 자체 static field class field 라고도 함 정적필드
    //static이 붙으면 클래스에 있는 값을 의미

}