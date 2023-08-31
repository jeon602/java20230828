package ch09Intreface.book.sec2;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteContol re;
        re = new SmartTelevision();
        re.turnOn();

        re = new Audio();
    }
}
