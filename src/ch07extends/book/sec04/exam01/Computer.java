package ch07extends.book.sec04.exam01;
    public class Computer extends Calulator{
        @Override
        public double areaCircle(double r) {
            System.out.println("Computer 객체의 areacircle()실행");
            return Math.PI * r * r;
    }
}
