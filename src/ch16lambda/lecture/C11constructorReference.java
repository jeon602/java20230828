/*package ch16lambda.lecture;
//파라미터가 있는 생성자
public class C11constructorReference {
    public static void main(String[] args) {
        MyInterface111 o1 = z -> new MyClass11(z);
        MyInterface111 o2 = MyClass11::new;
        MyInterface112 o3 = (a,b) -> new MyClass11(a,b);
        MyInterface112 o4 = MyClass11::new;
     }
}
class MyClass11{
    MyClass11(int a ){

    }
}
@FunctionalInterface
interface MyInterface111{
    MyClass11 method(int x);
}
@FunctionalInterface
interface MyInterface222{
    MyClass11 somemethod();
}*/