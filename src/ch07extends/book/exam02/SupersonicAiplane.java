package ch07extends.book.exam02;

public class SupersonicAiplane extends Airplane{
    public static final int NORMAL =1;
    public static final int SUPERSONIC =2;
    public int flyMode = NORMAL;


    public void fly(){
        if(flyMode == SUPERSONIC ){
            System.out.println("초음속 비행합니다.");
        }
        else
            super.fly();
        //비행기 객체의 플라이 메소드 호출
    }
}
