package ch13generic.book.check07;
//688쪽의 확인문제 7번 ㅣ 람다식 문제
public class Example {
    private static int[] scores = {10,50,3};
    public static int maxOrMin(Operator operator){
        int result= scores[0];
        for(int score : scores){
//            result = operator.apply(result,score);
        }
        return result;
    }

    //최대값 얻기
    public static void main(String[] args) {
//        int max = maxOrMin();
//        System.out.println("최대값: " + max);

        //최소값 얻기
//        int min =maxOrMin();
//        System.out.println("최소값: " +  min);
    }
}
//max: 50. min: 3이 나오도록 int {(max)(min)}에 알맞는 코드
