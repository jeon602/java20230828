package ch18io.lecture;

public class c26printf {
    //일반적인 스트링 사용 - > s
//    d
//
//%s: 문자열 출력
//
    public static void main(String[] args) {
        System.out.printf("문자열:%s%n","java");
//        %S라고 지정한 곳에 argument를 찾을 수 없다.는 말이 나온다 ㅓ
        System.out.printf("문자열1:%s%n문자열2:%s%n","css", "react");

        //%d는 정수 십진법 출력
        System.out.printf("정수 %d&n",99);
        System.out.printf("정수1:%d&n정수2:%d%n",199,299);

//        System.out.printf("정수3:%d%n","java"); 이건 불가능.

//        conversion에는 argument index$는 순서대로 쓰지 않아도 된다/

        System.out.printf(" 정수2: %2$d%n정수1:%1$d%d ",100,200); //정수 2: 200.
//                                                                정수 1:100100
        System.out.printf("정수:%2$d%n",9,8); //8
    }
}
/*package ch18io.lecture;

public class C26printf {
    public static void main(String[] args) {
        // %s : 문자열 출력
        System.out.printf("문자열:%s%n", "java");
        System.out.printf("문자열1:%s%n문자열2:%s%n", "css", "react");

        // %d : 정수 십진법 출력
        System.out.printf("정수:%d%n", 99);
        System.out.printf("정수1:%d%n정수2:%d%n", 100, 200);
//        System.out.printf("정수3:%d%n", "java");


        // argument_index$
        System.out.printf("정수2:%2$d%n정수1:%1$d%n", 100, 200);
        System.out.printf("정수:%1$d%n", 9, 8); // 9
        System.out.printf("정수:%2$d%n", 9, 8); // 8
    }
}선생님 코드
*/