package leetcode.sec1046;

import static org.junit.jupiter.api.Assertions.*;

class Solution1046Test {
    void lastStoneWeight(){
        Solution1046 o1 = new Solution1046();
        int result1 = o1.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        assertEquals(1,result1);

        int result2 = o1.lastStoneWeight(new int[]{1});
        assertEquals(1, result2);

    }

}