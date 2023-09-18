package ch18io.lecture;
//오전 9:21 2023-09-18
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C23filter {
    public static void main(String[] args) {
        try {
            InputStream keyboard = System.in; //
            InputStreamReader isr =new InputStreamReader(keyboard);
            //또 다시 buffer로 바꿈
            BufferedReader br = new BufferedReader(isr);

//        BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
//        String line = null;
    //    while (br.readLine());
            String line1 = br.readLine();
            System.out.println("line1 = "+ line1);

            String line2= br.readLine();
            System.out.println("line2 = "+ line2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
