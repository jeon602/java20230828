package ch18io.book.sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//page.782
public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            byte a = 10;
            byte b = 10;
            byte c = 10;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();//스트림을 열어주면 반드시 닫아줘야 함. ---> 예시) ~~파일이 실행 중이며, 실행중에는 전달or 삭제가 불가~~이 경우와 비슷함

        }catch (IOException exception) {
            exception.printStackTrace();
        }
        //C:/Temp/test1.db 파일 생성 (실행 전에 C: /Temp 디렉토리가 있어야 함)
    }
}
/*FileOutputStream생성자는 파일 생성이 불가능하면  IOStream을 발생시킨다. */