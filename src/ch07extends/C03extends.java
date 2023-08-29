package ch07extends;

public class C03extends {
    public static void main(String[] args) {
        MySubClass031 o1 = new MySubClass031(); //
        o1.printName();
    }
}
class MyClass03{
    private String name;

    void printName(){
        System.out.println("name = " + name);
    }
}
class MySubClass031 extends MyClass03{
     void setName(String name) {
         //private 필드는 자식 클래스에서 사용할 수 없음
        //this.name =name; 이게 불가능하다 상속을 염두해두고 입력할 것
     }
}