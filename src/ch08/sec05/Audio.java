package ch08.sec05;

public class Audio implements RemoteControl {
    private int volume;


    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else{
            this.volume = volume;
        }
        System.out.print("현재 Audio 볼륨"+volume);
        //System.out.print("현재 Audio 볼륨"+this.volume); 1000으로 설정하면 0~10(버그)
    }


}



