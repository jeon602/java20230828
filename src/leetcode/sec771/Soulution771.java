package leetcode.sec771;

import java.util.HashSet;
import java.util.Set;

//leetCode 771번 문제
public class Soulution771 {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {//********
            jewelSet.add(c);
    }

        return 0;
    }
}
//int count =0;
//    for(char c : stones.toCharArray()){
//        if (jewelSet.contains(c)){
//            count++;
//        }
//    }
//return count;
//--------------------------------------------------------------




/*package leetcode.sec771;

import java.util.HashSet;
import java.util.Set;

//leetCode 771번 문제
public class Soulution771 {
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {//********
            jewelSet.add(c);
    }

        return 0;
    }
}
*/