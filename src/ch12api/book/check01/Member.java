package ch12api.book.check01;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id= id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

//blue: 이파란이 나오도록
}
