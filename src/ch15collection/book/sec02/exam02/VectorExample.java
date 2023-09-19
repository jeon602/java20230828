package ch15collection.book.sec02.exam02;


import ch15collection.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        Thread threadA = new Thread() {
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
                }
            }
        };
        Thread threadB = new Thread() {
            public void run() {
                for (int i = 1001; i <= 2000; i++) {
                    list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));

                }
            }
        };

        threadA.start();
        threadB.start();
        //작업 스레드 들이 모두 종료될 때 까지 메인 스레드를 기다리게 함.
        //작업 스레드 끝났다고 해서 모든 프로세스가 끝나는 것이 아님. 모든 스레드가 끝나야 함. 918/919 어제 유튜브 내용.
        try {
            threadA.join();
            threadB.join();
        } catch (Exception e) {

        }//저장된 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();
    }
}
