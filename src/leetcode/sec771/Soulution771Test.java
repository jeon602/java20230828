package leetcode.sec771;

import static org.junit.jupiter.api.Assertions.*;

class Soulution771Test {
    void numJewelsInStones() {
        Soulution771 o = new Soulution771();
        int i = o.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, 1);

        int j = o.numJewelsInStones("aA", "aAAbbbb");

        assertEquals(0, j);
    }
}
/*package leetcode.sec771;
leetcode 771번 문제

import static org.junit.jupiter.api.Assertions.*;

class Soulution771Test {
    void numJewelsInStones(){
        Soulution771 o = new Soulution771();
        int i = o.numJewelsInStones("aA" , "aAAbbbb");
        assertEquals(3,1);

        int j = o.numJewelsInStones("aA", "aAAbbbb");
//        int j = o.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(0,j);
    }
}*/