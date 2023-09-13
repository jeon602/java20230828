package leetcode.sec1748;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Solution1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));

    }

    public static int sumOfUnique(int[] nums) {
//leetcode:static XX
        Map<Integer, Long> collect = Arrays.stream(nums)
                //
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(), //e-> e
                        Collectors.counting()));//{1=1 , 2=2, 3=1}

        int sum = collect.entrySet().stream()
                .filter(x->x.getValue()==1)
                //1빈도수를 map으로 ,, map - set ---> api:  Map<K,V> key - > value
                .mapToInt(x->x.getKey())
                .sum();

        return sum;
//수: 몇 개 있는지 .1개인 entry만 거르고(filter) . entry의 키만 더하기

    }

    }
//    public int sumOfUnique(int[] nums){
//        Map<Integer,Integer> map = new HashMap<>();
//       for (int num: nums){
//           if(!map.containsKey(num)){
//               //이미 있으면
//               int oldValue = map.get(num);
//               //map.put(num,1);
//               map.put(num, oldValue +1);
//           }else {
//               map.put(num,1); //첫 발견
//           }
//       }

//        //[1,1]
//        //[2,2]
//        //[3,1]
//        int sum =0;
//       for (Map.Entry<Integer,Integer> entry: map.entrySet()){
//           if(entry.getValue().equals(1)){
//               sum +=entry.getKey();
//           }
//       }
//        System.out.println(map);
//
//        return 0;
//    }
//










//   /*stream을 이용하여 주어진 정수 배열nums엣서 고유한 요소들의 합을 계산하는 방법
//    IntStream을 이용하여 배열을 스트림으로
//     distint 메소드를 호출하여 중복되지 않는 요소들을 합을 계산    --distint
//     선택한 고유한 요소들의 합은 sum 사용
//
//
//
//     주어진 정수 배열에서 고유한 요소들은 배열내에서 단 한번만 나타나는 요소들을 의미한다.
//     이들의 합을 계산해야 한다
//
//     요소눈1과 3 이며 이드의 합은 4.
//     stream을 사용하여 풀기 위한 방법 _ 1.IntStreamㅍㅍㅍㅍ*/





