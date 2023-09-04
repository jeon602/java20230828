package ch09nested.book.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        Home home= new Home();

        home.use1();
        home.use2();
        home.use3(new RemoteControl(){
            public void turnOn(){
                System.out.println("난방 on ");
            }
            public void turnOff(){
                System.out.println("난방 off");
            }
        });
    }
}
