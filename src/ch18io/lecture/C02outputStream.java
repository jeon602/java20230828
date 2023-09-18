package ch18io.lecture;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02outputStream {
    public static void main(String[] args) {
     try {
         OutputStream os = new FileOutputStream("out.txt");
         os.write(70); //스트림이 열리면 꼭 반드시 닫아줘야 함
         os.write(71);
         os.write(73); //int를 넣었지만, 4byte중 나머지 3을 버리고 1byte만 사용

         os.close(); //파일이나 어떤 것이든 스트림을 열면 꼭 닫아줘야 함.
         //꼭 닫아야 하는

     }catch (IOException e){
         e.printStackTrace();
     }
    }
}
