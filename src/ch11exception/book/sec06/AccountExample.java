//package ch11exception.book.sec06;
//
//public class AccountExample {
//    public static void main(String[] args) {
//        Account account = new Account();
//        account.deposit(10000);
//        System.out.println("예금액: " + account.getBalence());
//
//    try {
//        account.withdraw(30000);
//    }catch (InsufficientException e ){
//        String message = e.getMessage();
//        System.out.println(message);
//    }
//
//    }
//}
////프로그램의 진입점 역할(entry point)을 하는 AccountExample
////main 메소드가 프로그램이 실행될 때 가장 먼저 호출된다
////Account account = new Account();':' Account
/////클래스의 객체를 생성하고  account변수에 할당한다.