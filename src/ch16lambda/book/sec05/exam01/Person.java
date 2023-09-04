package ch16lambda.book.sec05.exam01;

import ch16lambda.book.sec04.Calculable;

public class Person {
    public void action(Calculable calculable){
        double result = calculable.calc(10,4);
        System.out.println("result: " + result);
    }
}
