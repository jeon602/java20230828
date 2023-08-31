package ch09Intreface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C04string {
    String a= "jave";

    Object o = a;
    Serializable s = a;
    CharSequence c =a;
    Comparable<String> cp = a;
    Constable co =a;
    ConstantDesc cd = a;
    //어디선가 안전하게 실행시킬 수 있음

}
