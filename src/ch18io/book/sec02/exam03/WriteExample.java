package ch18io.book.sec02.exam03;
//785 페이지
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test3.db");

            byte[] array = {10,20,30,40,50};

            os.write(array,1,3); //1번 인덱스부터 3개★까지만 출력함.
            os.flush();
            os.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*public static void main (String[] args){
try(OutputStream os = new FileOutputStream("C:/Temp/test3.db");){
byte[] array = {10.20,30,}
os.write(array)}*/
