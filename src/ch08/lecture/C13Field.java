package ch08.lecture;

public class C13Field {
    public static void main(String[] args) {
        System.out.println(MyInterface13.VALUE);
        System.out.println(MyInterface13.NAME);
        System.out.println(MyInterface13.HOME_ADDRESS);
    }
}
interface MyInterface13{
    int VALUE = 30;
    public static final String NAME = "Java";
    String HOME_ADDRESS = "seoul";
    //상수의 경우 대문자와 _언더바를 이용함. 문법적 오류는 없지만. shift+ f 키를 누르면 힌트를 준다.
}