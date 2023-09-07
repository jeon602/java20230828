package ch13generic.book.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Prodect<Tv,String>prodect1 = new Prodect<>();


        prodect1.setKind(new Tv());
        prodect1.setModel("SMART TV");

        Tv tv = prodect1.getKind();
        String tvModel = prodect1.getModel();

        Prodect<Car,String>prodect2 = new Prodect<>();
        prodect2.setKind(new Car());
        prodect2.setModel("SUV CAR");


        Car car = prodect2.getKind();
        String carModel = prodect2.getModel();
    }
}
