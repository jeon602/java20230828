package leetcode.sec2206;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums){
    Map<Integer,Integer> map = new HashMap<>();
    for (int i : nums) {
        map.put(i, map.getOrDefault(i,0)+1);
    }
    for(int count : map.values()){
        if(count %2 ==1){
            return false;

        }
        /* if(count %2 ==1){
            return false;

        }*/
    }
    return true;
    }
}
