package ch17stream.lecture;

import java.util.stream.IntStream;

//스트림 중에서 참조타입 _ 기본타입_int,long, double 참조타입을 기본타입으로 변경하면서...
public class C20primitive {
    //기본타입 stream : Intstream .Longstream doublestream
    //참조타입 stream :
    public static void main(String[] args) {
        IntStream.of(3,9,1,2,7)
                .boxed()
                .max(Math::max)
                .get();


    }
}
