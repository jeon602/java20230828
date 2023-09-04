package ch16lambda.book.sec05.exam02;

public class Person {
    public void orthering(Comparable comparable){
        String a = "홍일동";
        String b = "홍이동";
        int result = comparable.compare(a,b);
        if(result<0){
            System.out.println(a + "은 " + b + "보다 앞에 옵니다.");
        }else if(result == 0){
            System.out.println(a + "은 " + b + "와 같습니다.");
        }else{
            System.out.println(a + "은 " + b + "보다 뒤에 옵니다.");
        }
    }
}
