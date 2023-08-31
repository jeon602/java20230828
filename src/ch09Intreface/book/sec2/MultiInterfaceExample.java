package ch09Intreface.book.sec2;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        RemoteContol rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        Searchable searchable = new SmartTelevision();
        searchable.search("http://www.youtube.com");
    }
}
