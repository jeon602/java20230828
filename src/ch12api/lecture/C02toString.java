package ch12api.lecture;

public class C02toString {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
//        o1.toString();
        MyClass02 s1 = o1;
        System.out.println(s1);

        Object o2 = o1;
        System.out.println(o2.toString());
    }
}
class MyClass02{
    public String toString(){
        return "Myclass02 객체입니다";
    }
}