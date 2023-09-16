package ch11exception.lecture;
//9월 14일 9시 53분
public class C02Exception{
    public static void main(String[] args) {
        System.out.println("code1...");
        System.out.println("code2...");

        int[]arr = {1,2};
        //ㅣ길이가 2인 인덱스에
        int i = arr[2]; //IndexOfBoundsException

        System.out.println("code3.....");
    }
}
