package leetcode.sec287;

import static org.junit.jupiter.api.Assertions.*;

class Solustion287Test {
    void findDuplicate(){
        Solustion287 o =new Solustion287();
        int num1 = o.findDuplicate(new int[]{1,3,4,2,2});
        assertEquals(2, num1);

        int num2 = o.findDuplicate(new int[] {3,1,3,4,2});
        assertEquals(3,num2);
    }

}