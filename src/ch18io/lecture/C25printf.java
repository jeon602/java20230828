package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력할 문자들"); //얘가 프린트 스트림 적어도 하나의 파라미터를 갖는다
        System.out.printf("출력할 문자들2 ", "java",3,3.14);
        //                 첫번째 파마미터에 들어갈 코드. 형식은 api
        //printf 에 들어가면 포멧 스트링syntax


    }
}
/*package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력할 문자들");
        System.out.printf("출력할 문자들2", "java", 3, 3.14);

        // %n : new line
        System.out.printf("출력할 문자들3%n다음줄 출력됨");
        System.out.printf("출력..%n");
        System.out.printf("%n출력@@@");

        // %% : %(percent)
        System.out.printf("%n%%:퍼센트");


선생님 코드
    }

}
*/