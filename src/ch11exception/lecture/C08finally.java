package ch11exception.lecture;
//9월 14일 11시 54분
public class C08finally {
    public static void main(String[] args) {
        try {
            System.out.println("코드 실행");
            return;
        }finally {
            System.out.println("무조건 실행해야 하는 코드");
        }
        //리턴 하든 안 하든 실행이 되어야 함
    }
}
//코드 실행
//무조건 실행해야 하는 코드