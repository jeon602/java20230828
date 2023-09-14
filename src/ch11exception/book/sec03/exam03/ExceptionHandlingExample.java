package ch11exception.book.sec03.exam03;
//9월 14일 11시 54분

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo",null, "200"};

        for(int i= 0; i<= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value ) ;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열의 인덱스가 초과됨:" +e.getMessage());

            }catch (NullPointerException | NumberFormatException e) {
                System.out.println("데이터에 문제 있음:" +e.getMessage());
            }
        }
    }
}
//null이 존재해서 NullPointerException발생 가능.
