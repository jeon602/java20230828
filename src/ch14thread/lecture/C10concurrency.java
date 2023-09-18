package ch14thread.lecture;
//주의**
public class C10concurrency {
    private static int value = 0; //static field
    //concurrency동시에 일어나는..
    public static void main(String[] args) {
        Thread t1 = new Thread(()-> {
            for (int i=0; i<10000; i++){
                value++;
            }
        });//실행값 value = 10000까지 밖에 원하는 값이 나오는 이유...성능에 따라 차이는 있으나..
        t1.start();
        Thread t2 = new Thread(()-> {
            for(int i= 0; i<10000; i++){
                value++;
            }
        });
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e ){
            throw new RuntimeException(e);
        }
        System.out.println("value= "+ value);
    }
}
