package ch11exception.lecture;

public class C20throws {
    public static void main(String[] args) {

    }
    public static void method1() throws ClassNotFoundException {
        method2();
    }
    public static void method2() throws ClassNotFoundException{}
}
//api - ClassNotFoundExeption ----- ReflectiveOperationException /exception 그냥 가능한./