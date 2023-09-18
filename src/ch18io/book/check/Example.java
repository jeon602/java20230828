//package ch18io.book.check;
//
//import ch08.book.sec03.B;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.InputStreamReader;
//
//public class Example {
//    public static void main(String[] args) {
//        String filePath = "ch18io.book.check.Example";
//        try {
//            FileReader fr = new FileReader(filePath);
//            BufferedReader br = new BufferedReader(new FileReader(fr));
//            try() {
//                int rowNumber = 0;
//                String rowData;
//                while (true) {
//                    rowData = br.readLine();
//                    rowNumber++;
//                    if (rowData == null) {
//                        break;
//                    }
//                    System.out.printf("%2d: %s%n", rowData, rowNumber);
//                }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
package ch18io.book.check;

//821page 확인 문제 7번 == 다음은 1234번

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) {
        String filePath = "src/ch18io/book/exercise/p07/Example.java";

        // BufferedReader.readLine
        // PrintStream.printf

        try {

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            try (br; fr;) {

                int rowNumber = 0;
                String rowData;
                while (true) {
                    rowData = br.readLine();
                    rowNumber++;
                    if (rowData == null) {
                        break;
                    }

                    System.out.printf("%2d: %s%n", rowNumber, rowData);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

