package ch16lambda.lecture;

public class C10constructorReference {
    public static void main(String[] args) {
        MyInterface10 o1 = () -> {
            return new MyClass10();
        };
                //추상메소든데 파라미터가 없으니
    MyInterface10 o2 = () -> new MyClass10();
    MyInterface10 o3 = MyClass10::new;
    }
}
class MyClass10{
    MyClass10(){}
}
interface MyInterface10{
    //생성자 참조
    MyClass10 method();
//생성자를 리턴함
    //Function의 인터페이스가
}