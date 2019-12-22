package leetcode;

import java.util.TreeSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

public class Solution0220 {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long l = nums[i];
            Long floor = set.floor(l);
            Long ceiling = set.ceiling(l);
            if ((floor != null && l - floor <= t)
                    || (ceiling != null && ceiling - l <= t)) {
                return true;
            }
            set.add(l);
            if (set.size() == k + 1) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

}
