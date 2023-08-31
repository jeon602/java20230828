package ch09Intreface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i =3;
//        i는 인티저 3
    //다른 타입을 형변환시키는 코드를 최대한 많이 작성해보기

        Number n = i;
        Object o = i;
        Serializable s = i;
        //내가 작성하지 못한 형변환.
        Comparable<Integer> cp = i;

        Constable c =i;

        ConstantDesc cd =i;


    }
}
