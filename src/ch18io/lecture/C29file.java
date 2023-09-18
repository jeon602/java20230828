package ch18io.lecture;

import java.io.File;

public class C29file {
    public static void main(String[] args) {
        String path= "C:/Temp";
        File file = new File(path);

        System.out.println("file.isdirectory() = "+ file.isDirectory());
        File[] files =file.listFiles();
        for(File f : files) {
            System.out.println("f.getName() =" + f.getName());
        }
    }
}
