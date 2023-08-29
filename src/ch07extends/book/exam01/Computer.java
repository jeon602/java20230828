package ch07extends.book.exam01;
    public class Computer extends Calulator{ //컴이 상속받음
        @Override
        public double areaCircle(double r) {
            System.out.println("Computer 객체의 areacircle()실행");
            return Math.PI * r * r;
    }
}
