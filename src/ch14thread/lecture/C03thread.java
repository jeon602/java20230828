package ch14thread.lecture;

import javax.tools.Tool;
import java.awt.*;

public class C03thread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();//여기서부터+  작업 스레드가 실행하는 코드
                for (int i = 0; i < 5; i++) {//
                    toolkit.beep();//
                    try {//
                        Thread.sleep(500);// 작업 스레드 생성
                    } catch (Exception e) { //작업 스레드 실행.. 작업 스레드가 실행하는 코드
                    }//
                }

            }
        });
        thread.start(); //작업 스레드 실행

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }//메인 thead가 실행하는 코드
    }
}