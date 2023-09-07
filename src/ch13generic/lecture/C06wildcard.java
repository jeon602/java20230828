package ch13generic.lecture;

import ch08.book.sec03.C;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;


        MyClass06<Dog> o1 = new MyClass06<>();
        //MyClass06<Animal> o2 = o1; 불가능하다  왜?
        //o2.set(new Animal());위가 가능하다면 되어야 하지만 문법 오류.

        //set method 나 getmethod를 사용하고 싶으면 ..
        MyClass06<? extends Animal> o3 = o1;
        //타입 파라미터가 animal 하위 파라미터일 경우 가능.
        //get메소드를 사용할 때 o3 를 안전하게 애니몰로 받을 수 있다
        // extends Animal
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
//        MyClass06<? extends Animal> o9 = new MyClass06<Object>();불가능하다

        Animal ani1 = o3.get(); //안전
//        o3.set(new Dog()); //안전하지 않음.
        //왜 굳이> ㅇ안전 하니, 형변환 없이 animalmethod을 실행시킬 수 있다
        ani1.animalMethod();
        //o6.set(new Cat());
        //o7.set(new Dog());
        ani1.animalMethod();

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
        //MyClass06<? super Animal> o10 = new MyClass06<Dog>(); //X
        o4.set(new Dog());
        o5.set(new Dog());
        o4.set(new Cat());
        o4.set(new Animal());
        //o3o6o7o8 캣이 들어가 ㄹ 수 없다

    }
}

class Animal {
    public void animalMethod(){}
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class MyClass06<T> {
    public void set(T param) {
    }

    public T get() {
        return null;
    }
}