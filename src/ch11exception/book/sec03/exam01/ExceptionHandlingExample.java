package ch11exception.book.sec03.exam01;
//9월 14일 11시 54분

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};

        for(int i=0; i<=array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: "+ e.getLocalizedMessage());
            }catch (NullPointerException e) {
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            }
        }
//        String[] array = {"100","1oo"};
//
//        for (int i=0; i<=array.length; i++);{
//        try {
//            int i;
//            int value = Integer.parseInt(array[i]);
//            System.out.println("array[" + i + "]:" +value);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(" 배열의 인덱스가 초과됨: "+ e.getMessage());}
//        }catch (NullPointerException e){
//            System.out.println("숫자로 변환할 수 없음:" + e.getMessage());
        }
    }
