/*package leetcode.sec1648;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> chars = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            chars.add(c);
        }

        chars.contains('a');
        chars.contains('d');

        chars.contains('b');
        chars.contains('a');
        chars.contains('d');
        chars.contains('a');
        chars.contains('b');


        chars.contains('b');
        chars.contains('a');
        chars.contains('a');
        int count = 0;
        for (String word : words) {
            boolean consistenString = true;
            for (char c : word.toCharArray()) {
                if (!chars.contains(c)) {
                    consistentString = false;
                    break;
                }
            }


            if (consistentStrings) {
                count++;
            }
        }
        return count;
    }
}

*/