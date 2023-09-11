package leetcode.sec1512;

import static org.junit.jupiter.api.Assertions.*;

class Solution1512Test {
    void numIndenticalParis() {
        Solution1512 s = new Solution1512();
        int i = s.numIndenticalParis(new int[]{1, 2, 3, 1, 1, 3});
        assertEquals(4, i);
        int j = s.numIndenticalParis(new int[]{1, 1, 1, 1});
        assertEquals(6, j);
        int k = s.numIndenticalParis(new int[]{1, 2, 3});
        assertEquals(0, k);

    }

    class Solution1512 {

        public int numIndenticalParis(int[] ints) {
        return 0;
        }
    }

}