//package ch11exception.lecture;
//
//import java.io.FileNotFoundException;
//
//public class C21throws {
//    public static void main(String[] args) {
////        var input = new FileNotFoundException()
//
//    }
//}
package ch11exception.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C21throws {
    public static void main(String[] args) throws FileNotFoundException {
        var input = new FileInputStream("file");

    }
}