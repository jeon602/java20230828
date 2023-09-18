package ch08.sec05;

import ch08.book.sec03.A;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
//
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();

        rc.turnOn();
        rc.setVolume(1000);

        rc.setMute(true);
        rc.setMute(false);
    }
}
