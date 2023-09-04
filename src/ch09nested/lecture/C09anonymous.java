package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyCLass09 o1 = new MySubClass091();
        MyCLass09 o2 = new MyCLass09(){

            //자식 클래스 몸통
            //field
            //method ~~16장으로 이어진다.
        };
        //익명 클래스는 anonymous class
        //상위클래스를 상속받은 자식클래스가 있는 자식클래스의 구현을
    o2.method01();
    }
}

class MyCLass09{
    void method01(){
        System.out.println("MyCLass09.method01");
    }

}
class MySubClass091 extends MyCLass09{
    void method01(){
        System.out.println("MySubClass091.method01");
    }
}