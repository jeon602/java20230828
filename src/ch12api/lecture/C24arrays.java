package ch12api.lecture;

import ch08.book.sec03.A;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        //배열을 다루는 메소드들이 있음
        //equals
        //fill배열을 특정 값으로 채욱;
        //sort배열정렬
        //binarySearch 특정원소의 위치찾기
        //toString: 문자열로 변환
        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        //배열의 초기값은 0
//        fill이 아니였으면, for 문 사용
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //equals
//        int[] arr3 = {3,4,5};
        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {4, 3, 5};

        System.out.println(arr3 == arr4);
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.equals(arr4, arr5));

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4, arr5));

        //이진 탐색 binary search
        int[] arr6 = {5, 3, 1, 7, 9};
        int i = Arrays.binarySearch(arr6,3);
        System.out.println(i);

        Arrays.sort(arr6); //1 3 5 7 9
        Arrays.binarySearch(arr6,3);
        int i1 = Arrays.binarySearch(arr6,3);
        int i2 = Arrays.binarySearch(arr6,3);
        System.out.println(i1);

    }
}
