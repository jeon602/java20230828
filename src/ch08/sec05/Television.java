package ch08.sec05;

public class Television implements RemoteControl{
    private int volume;
    public void turnOn(){
        System.out.println("티비를 켭니다");
    }
    public void turnOff(){
        System.out.println("티비를 끕니다");



    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else if (volume< RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: "+ this.volume);
    }

}

