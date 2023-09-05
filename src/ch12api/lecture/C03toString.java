package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 =new Car("tesla", 5000);
        Car car2 =new Car("kia", 3000);
        Car car3 =new Car("bmw", 2000);

        System.out.println(car1.getClass() + ":" + car1.getClass());
        System.out.println(car2.getClass() + ":" + car2.getClass());
        System.out.println(car3.getClass() + ":" + car3.getClass());

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
class Car {
    private String model;
    private int price;

    public Car(String model,int price){
        this.model = model;
        this.price = price;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }


    public String toString(){
        return "Car{" +
                "model='" + model + '\'' +
                ",price=" + price +
                '}';
    }
}