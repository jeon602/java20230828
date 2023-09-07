package ch13generic.lecture;
//제한된 파라미터
public class C10generic {
    public static void main(String[] args) {

    }
}
class MyClass10<T> {
    public void method(T param){
        param.equals(null);
        param.toString();
    }
}