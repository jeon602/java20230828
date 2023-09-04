package ch09nested.book.sec07.exam02;

import java.rmi.Remote;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        public void turnOn() {
            System.out.println("tv를 켭니다.");
        }

        public void turnOff() {
            System.out.println("tv를 끕니다.");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            public void turnOn() {
                System.out.println("에어컨을 켭니다");
            }

            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    };
}

