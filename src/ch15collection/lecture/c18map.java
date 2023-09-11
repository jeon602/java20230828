package ch15collection.lecture;

import java.util.Map;

public class c18map {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("n1","he",
                "n2","yu");
        //api -> map의 of메소드
//        of의 파라미터가 짝수개 ,,, entry로 저장하니까.
        System.out.println(map);
    }
}
