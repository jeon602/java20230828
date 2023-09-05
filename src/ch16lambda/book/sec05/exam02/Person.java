package ch16lambda.book.sec05.exam02;
//710페이지
public class Person {
    public void orthering(Comparable comparable){
        String a = "홍일동";
        String b = "김이박";
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
//
