package ch15collection.book.sec06.exam;

import ch08.book.sec03.C;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinbox = new Stack<Coin>();


        coinbox.push(new Coin(100));
        coinbox.push(new Coin(50));
        coinbox.push(new Coin(500));
        coinbox.push(new Coin(10));

        while (!coinbox.isEmpty()){
            Coin coin =coinbox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }
    }
}
