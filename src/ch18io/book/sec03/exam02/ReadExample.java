package ch18io.book.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("C:/Temp/test2.db");

            byte[] data = new byte[100];

            while (true){
                int num = is.read(data);
                if(num == -1) break;

                for(int i=0; i<num; i++){
                    System.out.println(data[i]);
                }
            }
            is.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*수업내용-- 위 코드와 다른 이유 : 간결하게 작성 가능한 강사님 코드
* package ch18io.book.sec03.exam02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("C:/Temp/test2.db")) {
            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);

                if (num == -1) {
                    break;
                }

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/