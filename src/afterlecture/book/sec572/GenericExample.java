package afterlecture.book.sec572;

public class GenericExample {
    public static void main(String[] args) {
        //Box<String>box1 = new Box<String>();
        //Box 를 생성할 때 string 대체
        Box<String>box1 =new Box<>();
        //<T>를 String으로 대체
        box1.content= "Hello";
        String str = box1.content;
//        System.out.println();괄호안에 str대신 box1.cintent
        System.out.println(str);

        //Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();
        box2.content= 100;
        int value = box2.content;
        System.out.println(value);
//Box를 생성할 때  Integer를 넣음. / type parameter 대신에
    }
}
