package ch11exception.book.check;

//import static sun.security.jgss.GSSUtil.login;

public class check07 {
    public static void main(String[] args) {
        try {
            login("white","12345");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            login("blue","54321");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void login(String id, String password)throws Exception {
        if(!id.equals("blue")){
//            throw new Exception()
        }
    }
}
