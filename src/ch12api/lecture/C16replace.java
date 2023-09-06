package ch12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        String a = "spring";
        String t = a.replace("sp", "abc");
//        a.replace("sp","abc");
        System.out.println(a);
        System.out.println(t);

        String b = "java is java";
        String t2 = b.replace("java", "python");
        System.out.println(t2);


        String c = "Java is java";
        String t3 = c.replace("java", "html");
        System.out.println(t3);
    }
}
