package ch17stream.book;
//772 확인문제 6번 (수정됨)
public class Member {
    private String name;
    private Integer age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
}
