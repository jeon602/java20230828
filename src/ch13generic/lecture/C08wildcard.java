package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        Myclass08<?> o1 = new Myclass08<Animal>();
        Myclass08<?> o2 = new Myclass08<Dog>();
        Myclass08<?> o3= new Myclass08<Cat>();
        Myclass08<?> o4= new Myclass08<Object>();
        //T에 모든 올 수 있도로고 했는데 아무거나 입력해도 object의 하위 개념이라 오브젝트 메소드를 사용할 수 있기 때문
        o1.equals(null);
        o2.toString();
        o3.hashCode();
        //MyClass08<Object> o5 = new MyClass08<Dog>();
    }

    public void otherMethod(){
        someMethod(new Myclass08<Object>());
        someMethod(new Myclass08<Animal>());
        someMethod(new Myclass08<Dog>());
        someMethod(new Myclass08<Cat>());
    }
    public void someMethod(Myclass08<?>param){
        param.equals(null);
        param.hashCode();
        param.toString();
    }
}
class Myclass08<T>{

}
/*package ch13generic.lecture;

public class C08wildcard {
    public static void main(String[] args) {
        MyClass08<?> o1 = new MyClass08<Animal>();
        MyClass08<?> o2 = new MyClass08<Dog>();
        MyClass08<?> o3 = new MyClass08<Cat>();
        MyClass08<?> o4 = new MyClass08<Object>();

        o1.equals(null);
        o2.toString();
        o3.hashCode();

//        MyClass08<Object> o5 = new MyClass08<Dog>();

    }

    public void otherMethod() {
        someMethod(new MyClass08<Object>());
        someMethod(new MyClass08<Animal>());
        someMethod(new MyClass08<Dog>());
        someMethod(new MyClass08<Cat>());
    }

    public void someMethod(MyClass08<?> param) {
        param.hashCode();
        param.equals(null);
        param.toString();
    }
}
class MyClass08<T> {

}
*/