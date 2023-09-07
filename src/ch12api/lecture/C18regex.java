package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x")); // true
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("x")); // false

        // 문자들
        System.out.println("xyz".matches("xyz")); // true
        System.out.println("xxx".matches("xxx")); // true
        System.out.println("xxx".matches("x")); // false

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}")); // false
        System.out.println("aaa".matches("a{1,3}")); // true
        System.out.println("aa".matches("a{1,3}")); // true
        System.out.println("a".matches("a{1,3}")); // true

        System.out.println("dog".matches("do{1,3}g")); // true
        System.out.println("dooog".matches("do{1,3}g")); // true
        System.out.println("doog".matches("do{1,3}g")); // true

        System.out.println("dodog".matches("do{1,3}g")); // false

        // 그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g")); // true
        System.out.println("dododog".matches("(do){1,3}g")); // true
        System.out.println("dog".matches("(do){1,3}g")); // true

        // 수량 :
        System.out.println("dog".matches("do{1,}g")); // true
        System.out.println("doog".matches("do{1,}g")); // true
        System.out.println("dooog".matches("do{1,}g")); // true
        System.out.println("doooog".matches("do{1,}g")); // true
        System.out.println("dooooooog".matches("do{1,}g")); //true

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g")); // true
        System.out.println("dog".matches("do?g")); // true
        System.out.println("doog".matches("do?g")); // false

        // * : 0번 이상
        System.out.println("dg".matches("do*g")); // true
        System.out.println("dog".matches("do*g")); // true
        System.out.println("doog".matches("do*g")); // true
        System.out.println("dooog".matches("do*g")); // true
        System.out.println("doooog".matches("do*g")); // true

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); // false
        System.out.println("dog".matches("do+g")); // true
        System.out.println("doog".matches("do+g")); // true
        System.out.println("dooog".matches("do+g")); // true
        System.out.println("doooog".matches("do+g")); // true

        // 문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g")); // true
        System.out.println("dig".matches("d[oi]g")); // true
        System.out.println("dag".matches("d[io]g")); //false

        System.out.println("dog".matches("d[^oi]g")); // false
        System.out.println("dig".matches("d[^oi]g")); // false
        System.out.println("dag".matches("d[^oi]g")); // true

        System.out.println("dag".matches("d[a-z]g")); // true
        System.out.println("dbg".matches("d[a-z]g")); // true
        System.out.println("dcg".matches("d[a-z]g")); // true
        System.out.println("dzg".matches("d[a-z]g")); // true

        System.out.println("dag".matches("d[a-cx-z]g")); // true
        System.out.println("dbg".matches("d[a-cx-z]g")); // true
        System.out.println("dcg".matches("d[a-cx-z]g")); // true
        System.out.println("ddg".matches("d[a-cx-z]g")); // false
        System.out.println("deg".matches("d[a-cx-z]g")); // false
        System.out.println("dfg".matches("d[a-cx-z]g")); // false
        System.out.println("dxg".matches("d[a-cx-z]g")); // true
        System.out.println("dyg".matches("d[a-cx-z]g")); // true
        System.out.println("dzg".matches("d[a-cx-z]g")); // true


        // 문자 분류 기호
        System.out.println("0".matches("[0-9]")); // true
        System.out.println("7".matches("[0-9]")); // true
        System.out.println("0".matches("\\d")); // true
        System.out.println("7".matches("\\d")); // true

        System.out.println("a".matches("[a-zA-Z_0-9]")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("8".matches("\\w")); // true

        // 예제 자바 변수명 작성규칙
        // : 숫자로 시작하면 안되고, 영문대소문자, _, $, 숫자
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); // true
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("4".matches(pattern));

        // 전화번호 패턴
        // 010-9999-9999
        // 02-9999-9999
        // 02-999-9999
        // 01099999999
        // 0212345678
        // 021235678
        //
        String pattern2 = "\\d{2,3}-?\\d{3,4}-?\\d{4}";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("02-999-9999".matches(pattern2));
        System.out.println("01099999999".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021235678".matches(pattern2));


//                          a부터 z까지,0부터 9까지,.점을 찍고 싶으면 역슬래쉬 두 번
        String parttern3 = "[a-z0-9]+@[a-z0-9]+ \\.[a-z0-9]+";

        System.out.println("731aa@naver.com".matches(parttern3));

        //or: | or이거나  pipe라고 한다.
        System.out.println("blahcatblah".matches(".*cat.*"));
        System.out.println("234dogblah".matches(".*dog*."));
        System.out.println("ifsdfjskldogblah".matches(".*(cat|dog*)."));
        System.out.println("blahcatblah".matches(".*(cat|dog*)."));


    }
}

      /* //504page = pattern.match
        //regular expression : 정규 표현식
        // 문자열의 패턴을 나타내는 기호들
        System.out.println("x". matches("x"));
        System.out.println("a". matches("a"));
        System.out.println("a". matches("x"));
        //문자들
        System.out.println("xyz".matches("xyz"));
        System.out.println("xxx".matches("xxx"));
        System.out.println("xxx".matches("x"));

        //수량자 (quantifiers)
        System.out.println("xxx".matches("x{3}"));
        System.out.println("aaa".matches("a{3}"));
        System.out.println("aa".matches("a{3}"));
        System.out.println("aaa".matches("a{1,3}"));
        System.out.println("aa".matches("a{1,3}"));
        System.out.println("a".matches("a{1,3}"));

        System.out.println("dog".matches("do{1,3}g"));//1,3은 몇 번 반복되는지 알려준다 do가 아님.
        System.out.println("dooog".matches("do{1,3}g"));
        System.out.println("doog".matches("do{1,3}g"));
        System.out.println("dodog".matches("do{1,3}g"));
        //그룹으로 묶는다면 : ()
        System.out.println("dodog".matches("(do){1,3}g"));
        System.out.println("dododog".matches("(do){1,3}g"));
        System.out.println("dog".matches("(do){1,3}g"));
        //수량
        //시작을 정의하는데 끝을 정의하고 싶지 않으면---~이상
        System.out.println("dog".matches("do(1,)g"));
        System.out.println("doog".matches("do(1,)g"));
        System.out.println("dooog".matches("do(1,)g"));
        System.out.println("doooog".matches("do(1,)g"));
        System.out.println("do00000g".matches("do(1,)g"));

//        ? 없거나  한번

        System.out.println("dg".matches("do?g"));
        System.out.println("dg".matches("do?g"));
        System.out.println("dg".matches("do?g"));
        //*: 0번 이상
        System.out.println("dg".matches("do*g"));
        System.out.println("dog".matches("do*g"));
        System.out.println("doog".matches("do*g"));
        System.out.println("dooog".matches("do*g"));
        System.out.println("dooooog".matches("do*g"));
        //     +: 1번 이상
        System.out.println("dg".matches("do+g"));
        System.out.println("dog".matches("do+g"));
        System.out.println("doog".matches("do+g"));
        System.out.println("dooog".matches("do+g"));
        System.out.println("doooog".matches("do+g"));
        // 예제 자바 변수명 작성 규칙
        //: 숫자로 시작하면 안되고, 영문대소문자 , _ , $
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern));
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("4".matches(pattern));
//**        System.out.println("H".matches("[]"));
        //true
        //true
        //true
        //false

        //예제2 전화번호 패턴
        //010-9999-9999
        //02-9999-9999
        //02-999-9999
        //01099999999
        //0212345678
        //021235678
        String pattern2 ="\\d{2,3}-?\\d{3,4}-?\\d[4]";
        System.out.println("010-9999-9999".matches(pattern2));
        System.out.println("02-9999-9999".matches(pattern2));
        System.out.println("01099999999".matches(pattern2));
        System.out.println("0212345678".matches(pattern2));
        System.out.println("021235678".matches(pattern2));
       //이메일 패턴
        //영문 소문자, 숫자가 여러개 나오고  @ 영문소문자, 숫자들, 영문소문자, 숫자 여러개
        //john23@google2.co2m
        String pattern3 = "";

//        System.out.println("np".matches("[0-35-8]"));전화번호 패턴문제 두번째 오답
        //        System.out.println("number".matches("[0-35-9]")); 전화번호 패턴문제
    }//"""[0-35-8]"
}*/