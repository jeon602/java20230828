//package ch11exception.lecture;
//
//import java.net.ConnectException;
//
//public class C22throws {
//    public static void main(String[] args) throws  {
//        Connection con =
//    }
//}

package ch11exception.lecture;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class C22throws {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection("","","");
        var input =new FileInputStream("");
        Class.forName("");

    }
}