package ch18io.book.sec02.exam02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os =new FileOutputStream("C:/Temp/test2.db"); //데이터를 test2.db파일로 하는 바이트 출력스트림 생성

            byte[] array = {10,20,30 };

            os.write(array); //array배열의 모든 바이트를 출력
            os.flush(); //내부 버퍼에 잔류하는 바이트를 출력, 버퍼를 비움.

            os.close();//출력 스트림을 반드시 닫아야 하며, 닫음으로써 사용한 메모리를 해제함- 입출력 스트림 역시 한번만 쓰고 다시쓰는 개념이 아님
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
