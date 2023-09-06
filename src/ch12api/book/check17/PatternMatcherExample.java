package ch12api.book.check17;
import java.util.regex.Pattern;
public class PatternMatcherExample {
    public static void main(String[] args) {
        // 첫번째는 알파벳  두번째부터 숫자와 알파벳, 8~12 , 대소문자허용
        String id = "AAngel1004";
        String Pattern = "[a-zA-z][a-zA-Z0-9]{7,11}";

        boolean isMatch = id.matches(Pattern);
        boolean isMatch2 = Pattern.matches(Pattern);

        if(isMatch){
            System.out.println("ID로 사용 가능합니다.");
        }else {
            System.out.println("ID로 사용이 불가능합니다.");
        }
    }
}
