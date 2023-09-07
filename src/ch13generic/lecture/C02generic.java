package ch13generic.lecture;

public class C02generic {
    public static void main(String[] args) {
        MyClass02<Object> o1 = new MyClass02<Object>();
        //이때 T가 오브젝트로
        MyClass02<String> o2 = new MyClass02<String>();
        //Integer, Boolean 다  사용가능한데 , int는 불가능하다
        //MyClass02<int> o5 = new MyClass02<>
    MyClass02<Object> o6 =new MyClass02<>();
    MyClass02<String> o7 =new MyClass02<>();
    MyClass02<Integer> o8 =new MyClass02<>();
    MyClass02<Boolean> o9 =new MyClass02<>();
    }
}
class MyClass02 <T> {
//    private Object a; Object가 아닌 정해지지 않은 타입으로 하자,. generic
   //<T>는 type parameter --제네릭 클래스 ,, T에 넣은 값에 따라 다르다.
    private T a;
}