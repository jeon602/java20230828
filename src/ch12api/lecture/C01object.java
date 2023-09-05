package ch12api.lecture;

public class C01object extends Object {
    public static void main(String[] args) {
        //모든 클래스의 상위 클래스 : Object-
        String s ="java";
        Object o1 = s;
        Integer i = 3;
        Object o2 = i;
        //모든 타입의 상위타입이다.-> 좁은 의미 모든 클래스 상위 클래스니,
        //오브젝트를 가진 메소드를 하위타입들이 모두 가진다.-> o1의 어떤 메소드를 실행할 때
        o1.toString();
        //실제 인스턴스 스트링(String s = "java";)이 실행된다

        C01object c = new C01object();
        Object o3 =c;


        int j = 30;
        Object o4 = j;
        //기본타입도 해당. ==모든 타입의 상위타입의 의미
        //Strint
    }
}
