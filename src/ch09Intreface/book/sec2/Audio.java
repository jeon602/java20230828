package ch09Intreface.book.sec2;

import ch09Intreface.book.sec2.RemoteContol;

public class Audio implements RemoteContol {
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {

    }
}
