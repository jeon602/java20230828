package ch07extends.book.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;


        Calulator calulator = new Calulator();
        System.out.println("원 면적: " + calulator.areaCircle(r));
        System.out.println();

        Computer computer =new Computer();
        System.out.println("원면적 " + computer.areaCircle(r));

    }
}
