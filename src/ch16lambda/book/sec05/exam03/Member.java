package ch16lambda.book.sec05.exam03;

public class Member {
    private String id;
    private String name;
    public Member(String id){
        this.id = id;
        System.out.println("Member(String id)");
    }
    private Member(String id, String name){

        this.id = id;
        this.name = name;
        System.out.println("Member(String id, String name)");
    }

//    public Member(String s, String s1) {
//
//    }


    public String toString(){
        String info = "{id: " + id + " , name: " + name + " }";
                return info;
    }
}
