package ch16lambda.book.sec05.exam01;

import ch16lambda.book.sec04.Person;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person =new Person();

        person.action(Computer :: staticMethod);
        Computer com = new Computer();
        person.action(com :: instanceMethod);
    }
}
