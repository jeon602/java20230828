package ch09Intreface.book.sec11;

public interface DriverExample {
    public static void main(String[] args) {
        Driver driver =new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();


        driver.drive(bus);
        driver.drive(taxi);
    }
}
