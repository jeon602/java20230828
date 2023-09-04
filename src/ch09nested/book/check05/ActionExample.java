package ch09nested.book.check05;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("복사를 합니다.");

            }
        };
    action.work();
    Action action2 = ()-> System.out.println("복사를 합니다2");
    action2.work();
    }
}
//클래스를 만드는 코드를 또 만들 필요가 없다. 간결해진다.왜 간결한 코드를 만드느냐. 한 번 쓰고 버릴 코드라서