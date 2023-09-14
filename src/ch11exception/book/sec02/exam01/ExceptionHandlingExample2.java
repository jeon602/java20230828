package ch11exception.book.sec02.exam01;
//오전 10:27 2023-09-14
public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); //----> 데이터가 null일 경우 NullPointException 가 발생한다.
            System.out.println("문자 수: " + result); //---> 예외 정보를 얻는 방법
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("[마무리 실행]\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}
//"C:\Program Files\Eclipse Adoptium\jdk-17.0.8.7-hotspot\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.1\lib\idea_rt.jar=51092:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\admin\IdeaProjects\java20230828\src\out\production\java20230828;C:\Users\admin\.m2\repository\org\junit\jupiter\junit-jupiter\5.8.1\junit-jupiter-5.8.1.jar;C:\Users\admin\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.8.1\junit-jupiter-api-5.8.1.jar;C:\Users\admin\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;C:\Users\admin\.m2\repository\org\junit\platform\junit-platform-commons\1.8.1\junit-platform-commons-1.8.1.jar;C:\Users\admin\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\admin\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.8.1\junit-jupiter-params-5.8.1.jar;C:\Users\admin\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.8.1\junit-jupiter-engine-5.8.1.jar;C:\Users\admin\.m2\repository\org\junit\platform\junit-platform-engine\1.8.1\junit-platform-engine-1.8.1.jar ch11exception.book.sec02.exam01.ExceptionHandlingExample2
//[프로그램 시작]
//
//        문자 수: 10
//        [마무리 실행]
//
//        Cannot invoke "String.length()" because "data" is null
//        [마무리 실행]
//
//        [프로그램 종료]
//
//        Process finished with exit code 0
//
