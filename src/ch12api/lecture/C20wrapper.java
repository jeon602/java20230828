package ch12api.lecture;

public class C20wrapper {
    public static void main(String[] args) {
        //wrapper class : 기본타입을 감싸고 있는 클래스
        //기본타입 byte. short, long , float double/char boolean
        //wrapper class: Byte. Short. Integer, Long, Float Double Charactor,
        //boxing: 기본 타입을 참조타입으로 변환


        //boxing
        int i = 500;
        //Integer j = new Integer(i);//deprecated 권장하지 않는다... java api = integer int value 곹 사라
        Integer k = Integer.valueOf(i);
        System.out.println(i);
        System.out.println(k);
        //System.out.println(j);

        //unboxing
        Integer l = Integer.valueOf(1000);
        int m = l.intValue(); //unboxing

        System.out.println(l);
        System.out.println(m);

        //auto boxing
        int n = 777;
        //Integer o = ~~~ 과거
        Integer o = n; //auto boxing

        //auto unboxing
        Integer p = Integer.valueOf(888);
        int q = p;




    }
}
