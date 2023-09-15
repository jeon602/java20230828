package ch18io.lecture;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C06write {
    public static void main(String[] args) {
        String path = "C:/Temp/out.txt";
        try (OutputStream os = new FileOutputStream(path);){

            byte[] b = {65,66,67,68,69};
//아스키 코드
            os.write(b);
            os.write(b,0,3);
            os.write(b,2,2);
            os.flush();
        }catch (IOException e){e.printStackTrace();
        }


    }
}
