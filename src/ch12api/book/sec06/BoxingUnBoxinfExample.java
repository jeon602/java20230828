package ch12api.book.sec06;
//526page 실습예제
public class BoxingUnBoxinfExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        int value = obj;
        System.out.println("value:" + value);

        int result = obj + 100; //과거ㅣ:obj,int.value
        System.out.println("result: " +result);

    }
}
