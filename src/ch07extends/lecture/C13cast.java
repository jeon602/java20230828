package ch07extends.lecture;

public class C13cast {
    public static void main(String[] args) {
        Animal13 ani1 = new Dog13();
        Animal13 ani2 = new Dog13();
        ani1.breath();
        ani2.breath();
        //타입 캐스팅 형 변환
        Dog13 d1 = (Dog13) ani1;
        d1.sniff(); //ok
        Cat13 c1 = (Cat13) ani2;
        c1.hunt();


    }

}
class Animal13{
    public void breath(){
        System.out.println("숨쉬다.");
    }
}
class Dog13 extends Animal13{
    public void sniff(){
        System.out.println("냄새를 맡다");
    }
}
class Cat13 extends Animal13 {
    public void hunt(){
        System.out.println("사냥을 하다");
    }

}