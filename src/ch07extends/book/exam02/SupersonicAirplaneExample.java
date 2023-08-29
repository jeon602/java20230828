package ch07extends.book.exam02;

public class SupersonicAirplaneExample {


    public static void main(String[] args) {
        SupersonicAiplane sa = new SupersonicAiplane();
        sa.takeoff();
        sa.fly();
        sa.flyMode = SupersonicAiplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAiplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
//