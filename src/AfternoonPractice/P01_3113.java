package AfternoonPractice;


public class ChildExample {
    public static void main(String[] args) {
        Parant parant= new child();

        parant field1 = "data";
        parant.method1();
        parant.method2();

        Child child = (Child) parant;

        child.field2 = "data2";
        child.method3();
    }
}
