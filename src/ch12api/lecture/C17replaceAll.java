package ch12api.lecture;

public class C17replaceAll {
    public static void main(String[] args) {
        //replaceAll : replac 특정 패턴을 다른 문자열로 변경한다.
        String a = "Java is java";
        String r = a.replace("java","python");
        System.out.println(r);

        String r2 = a.replaceAll("(java|JAVA)", "python");
        System.out.println(r2);
    }
}
