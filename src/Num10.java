//import java.io.*;
//import java.util.Scanner;
//
////822page check 10
////chapter18의 book.check  - example
//public class Num10 {
//    public static void main(String[] args) {
//        String scrPath = "";
//        String desPath = "";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("원본 파일 경로:");
//        scrPath = scanner.nextLine();
//
//        System.out.print("복사 파일 경로");
//        desPath = scanner.nextLine();
//
//        File file = new File(scrPath);
//
//        if(srcFile.exists()){
//            File desFile = new File(desPath);
//            File desFileDir = desFile.getParentFile();
//            //복사하는 일
//
//            InputStream is = new FileInputStream(scrFile);
//            OutputStream os = new FileOutputStream(desPath);
//
//            BufferedInputStream bis = new BufferedInputStream(is);
//            BufferedInputStream bos = new BufferedInputStream(os);
//
//            byte[]read = new byte[1024];
//            int len = 0;
//
//            while ((len))
//        }else {
//            System.out.println("원본파일이 존재하지 않습니다");
//        }
//    }
//}
////scanner BufferInputStream catch