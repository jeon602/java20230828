//package ch11exception.lecture;
//
//import java.io.FileInputStream;
//
//public class C16checked {
//    public static void main(String[] args) {
//        var input = new FileInputStream("file");//api  FileInputStream  ★ ★ ★ ★ ★ ★ ★ ★
//        //checked exception은 예외처리 코드 꼭 작성해야함
//    }
//}
package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class C16checked {
    public static void main(String[] args) {
        try {
            var input = new FileInputStream("file");
            //checked exception은 예외처리 코드를 반드시 작성해야 함
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
