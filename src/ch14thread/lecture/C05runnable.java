package ch14thread.lecture;
//스레드를 실행시키는 또 다른 방법 run

import java.awt.*;
import java.beans.IntrospectionException;

public class C05runnable {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        Thread thread1 = new Thread(r1);
        thread1.start();

        Runnable r2 = new YourRunnanle();
        Thread thread2 = new Thread(r2);
        thread2.start();
    }
}
class YourRunnanle implements Runnable{

    public void run(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}