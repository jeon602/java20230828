package leetcode.sec1431;

import ch08.book.sec03.A;

import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCadies) {
        List<Boolean> list = new ArrayList<>();

        //배열에서 최대값을 구하라 : [2, 3, 5, 1, 3]
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int candy : candies) {
        list.add((candy  + extraCadies) >= max);
        }


        return list;
    }
}