package ch18io.book.check;
//
//import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
////확인문제 10번 822쪽
////바이트 기반 스트림과 성는향상 보조스트림을 반드시 사용하세요.
//public class Example2 {
//    public static void main(String[] args) {
//        String path = "C:/Temp.txt";
//        File file = new File(path);
//        System.out.println("file.exists() =" + file.exists());
//
//        System.out.println("원본 파일이 존재하지 않습니다.");
////      원본파일이 있는지? -> 존재하지 않으면,,,
//        //여기까지의 실행 값은 file.exists() =false
//
////        Files.copy(Paths.get);
////      복사 파일 경로에서 디렉토리 존재하지 않으면 경로상의 모든 디렉토리를 자동 생성할 것.
//
////     복사가 성공되었을 때 "복사가 성공되었습니다."를 출력할 것
//        B
//}
//}
////실행값은
////원본 파일 경로: ~~~
////복사 파일 경로: ~~~
//// 복사가 성공되었습니다.
////?
//
//package ch18io.book.exercise.p07;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example2 {
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
