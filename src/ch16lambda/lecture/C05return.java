package ch16lambda.lecture;

public class C05return {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface MyInterface05{
    int method();
}

class MyClass05 implements MyInterface05{
    @Override
    public int method(){

        return 1;
    }
}