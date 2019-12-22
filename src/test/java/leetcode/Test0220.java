package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0220 {

    private final Solution0220 solution = new Solution0220();

    @Test
    @DisplayName("220 Contains Duplicate III")
    void containsNearbyAlmostDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        int t = 0;
        assertTrue(solution.containsNearbyAlmostDuplicate(nums, k, t));
    }
}