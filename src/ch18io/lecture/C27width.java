package ch18io.lecture;

public class C27width {
    public static void main(String[] args) {
//        width는 출력할 대상이 차지할 영역을 의미
        System.out.printf("@%1$6s@n","java"); //첫번째 argument 생략 가능
//                         @  java@n
//        System.out.printf("@%1$s%n","java");
//        System.out.printf("@%1$d%n","java");


//        flag: 출력방법 api 참고 conversion flag '-'
//        왼쪽 정렬

        System.out.printf("@%1$6s@%n","java");
        System.out.printf("@%1$-6s@%n","java");
//    -는 왼쪽 정렬이며, flag는 ~~사이에 넣는다.

//        .precision 0또는 양수로 작성 숫자형식의 문자와 작성이 가능하다. f랑 같이 사용하면 소수점이후 n번째 까지 설정을 해준다
//        precision api: 실수와 같이 사용하면 소숫점 이하 출력 갯수
        System.out.printf("%1$f%n",3.141592);
        System.out.printf("%1$.3f%n",3.141592);
        System.out.printf("%1$.1f%n",Math.PI);
        System.out.printf("%1$.0f%n",Math.PI);
     }
}
