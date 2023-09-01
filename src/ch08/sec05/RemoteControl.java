package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME =10;  //
    int MIN_VOLUME =0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

//    setMute 도 인스턴스 메소드
    default void setMute(boolean mute) {
        if(mute){
            System.out.println("무음 처리 합니다.");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
            setVolume(MAX_VOLUME);
        }
    }
}
