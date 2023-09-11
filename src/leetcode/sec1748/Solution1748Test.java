package leetcode.sec1748;

import static org.junit.jupiter.api.Assertions.*;

class Solution1748Test {
    void sumOfUnique(){
        Solution1748 o = new Solution1748();
        assertEquals(4,o.sumOfUnique(new int[]{1,2,3,2}));
        assertEquals(0,o.sumOfUnique(new int[]{1,1,1,1,1}));
        assertEquals(15,o.sumOfUnique(new int[]{1,2,3,4,5}));

    }

}