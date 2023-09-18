package ch14thread.book.check;

//633 확인문제 2번
public class example2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread();
        thread1.start();

        Thread thread2 = new Thread((Runnable) new MusicRunnable());
        thread2.start();
    }
}
class MusicRunnable extends example2  {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {

            }
        }
    }
}

class MovieThread extends example2  {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}