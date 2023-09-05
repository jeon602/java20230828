package ch12api.lecture;

public class C11string {
    public static void main(String[] args) {
        //String" 문자열

        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.println(a == b); //true
        System.out.println(a == c); //false
        //문자열을 비교하고 싶으면

        System.out.println(a.equals(b));//true equals 실수 주의
        System.out.println(a.equals(c));//true
    }
}
