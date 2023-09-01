package ch08.sec07;

public interface Service {
    default void defaultMethod1(){
        System.out.println("defaultMethod1의 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("defaultMethod2의 종속 코드");
        defaultCommon();
    }
    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }
    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }
    private static void staticCommon(){
        System.out.println("staticMethod의 중복 코드 C");
        System.out.println("staticMethod의 중복 코드 D");
    }
}
