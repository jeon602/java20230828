package ch18io.lecture;

import java.io.File;
import java.util.Date;



//스트림과는 상관 없는.      //파일의 정보,,etc...
public class C28file {
    public static void main(String[] args) {

        String path = "ch18io/lecture/C28file.java:8";
        File file = new File(path);


        //크기
        System.out.println("file.length() = "+ file.length());
        //있는지?
        System.out.println("file.length() = "+ file.exists());
        //경로
        System.out.println("file.length() = "+ file.getPath());
        //마지막 수정일시
        System.out.println("file.lastModified= " + file.lastModified());
        System.out.println("file.lastModified= " + new Date(file.lastModified()));
        //디렉토리 인지?
        System.out.println("file.isDirectory() = " + file.isDirectory());


    }
}
// api file  === File(Str)