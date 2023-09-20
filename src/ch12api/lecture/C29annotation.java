package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class C29annotation {
    @MyAnnotation29
    int field;
    public static void main(@MyAnnotation28 String[] args) {
        @MyAnnotation29
                int local;
    }
}
@Target({ElementType.FIELD, ElementType.METHOD,ElementType.LOCAL_VARIABLE})//중괄호 배열로 필드에만 붙일 수 있도록 한다는 의미
@interface MyAnnotation29 {}