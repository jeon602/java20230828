package ch12api.lecture;

public class C21wrapper {
    public static void main(String[] args) {
        int i=3;
        Integer j = Integer.valueOf(i);
        Object k =j;

        int l =5;
        Integer m= l;
        Object n= m;

        Object o = 7;

        //int p = o; //xx

        Integer q = (Integer) o; //강제 형변환 위험한 코드
        int r = q;

        int s = 30; //int 4byte
        long t = s;// 8byte

        Integer u =300;
//        Long v= u; //자동 언박싱과는 다르게 불가능한 코드. integerd

        float w = 3.14f;
        double x= w;

        Float y = 3.14f;
//        Double z = y;  --- > 불가능
    }
}
