package ch06class;

public class C10capsule {
    public static void main(String[] args) {

    }
}

class MyClass10 {
    //특별한 이유가 없다면
    //필드는 private로
    //관련된 메소드 getter setter 를 퍼블릭으로 작성
    private int age;  //필드 생성시 특별한 경우가 아니라면 private 붙여준다.
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}