package leetcode.sec287;

import java.util.HashSet;
import java.util.Set;

public class Solustion287 {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return 0;
    }
}
