package ch05enumeration.lecture;

public class C13enum {
    public static void main(String[] args) {
        MyEnum v1 = MyEnum.VALUE1;//타입을 쓸 때
        MyEnum v2 = MyEnum.VALUE2;//타입을 쓸 때
        MyEnum v3 = MyEnum.VALUE3;//타입을 쓸 때
        MyEnum v4 = MyEnum.MY_FIRST_VALUE;
        MyEnum v5 = MyEnum.VALUE3;


        System.out.println("(v1==v2) = " + (v1==v2));
        System.out.println("(v1==v4) = " + (v1==v4));
        System.out.println("(v3==v5) = " + (v3==v5));
//참조타입이라서 equals 사용 가능...
        System.out.println("(v1.equals(v2) =" + v1.equals(v2));
        System.out.println("(v3.equals(v5) =" + v3.equals(v5));
    }

}
//참조타입 : enum
enum MyEnum {
    //계절 시간...
    VALUE1,
    VALUE2,
    VALUE3,
    //콤마로 구분한 값 나열,,
    //값의 이름 작성 관습은  UPPER_SNAKE_CASE
    MY_FIRST_VALUE
}