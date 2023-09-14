//package ch11exception.lecture;
//
//public class C09catch {
//    public static void main(String[] args) {
////        System.out.println("");
//    int[] arr= {1,0};
////    int i = 3/ arr[0]; //여기서 exception이 발생할 수 있음.
//    int i = 3/ arr[1]; //여기서 exception이 발생할 수 있음.
//    }catch(ArithmeticException e){
//
//    }catch (IndexOutOfBoundsException e){
//
//    }
//}
//}
//}
package ch11exception.lecture;
//9월 14일 11시 54분

public class C09catch {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 0};
            int i = 3 / arr[0];

            System.out.println("try내의 흐름");

            // try block 에서
            // 여러 exception이 발생할 수 있으면
            // 여러 catch 블럭을 작성하면 됨
        } catch (ArithmeticException e) {
            System.out.println("잘못된 산술연산!!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스 참조@@@@@");
        }

        System.out.println("실행흐름 이어감.....");
    }
}
