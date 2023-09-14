package ch11exception.book.sec05;
//478479페이지 연습문제
public class ThrowsExample2 {
    public static void main(String[] args)throws Exception { //ClassNotFoundExeption도 가능하다
        findClass();
    }

    public static void findClass()throws ClassNotFoundException{
        Class.forName("java.lang.String2");
    }
}
