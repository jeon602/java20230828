package ch11exception.book.check;

public class check06 {
    public static void main(String[] args) {
        int value = 0;
        String[] strArray = {"10","2a"};
        for (int i = 0; i<=2; i++){
            try {
                value  = Integer.parseInt(strArray[i]);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과했습니다.");
            }catch (NumberFormatException e ){
                System.out.println("숫자로 변환이 불가능 합니다.");
            }finally {
                System.out.println(value);
            }
        }
    }
}
