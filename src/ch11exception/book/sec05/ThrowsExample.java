package ch11exception.book.sec05;
//478.479 쪽
public class ThrowsExample {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외처리: " + e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
//※나열해야 할 예외 클래스가 많을 경우 [ , ] 모든 예외를 간단히 떠넘길 수 있음.