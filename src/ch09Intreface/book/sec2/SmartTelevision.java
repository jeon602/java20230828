package ch09Intreface.book.sec2;

public class SmartTelevision implements RemoteContol,Searchable{
    public void turnOn(){
        System.out.println("티비를 켭니다.");
    }
    public void turnOff(){
        System.out.println("티비를 끕니다.");
    }
    //search() 추상 메소드 오버라이딩
    public void search(String url){
        System.out.println(url + "을 검색합니다.");
    }
}
