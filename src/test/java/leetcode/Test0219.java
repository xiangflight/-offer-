package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0219 {

    private final Solution0219 solution = new Solution0219();

    @Test
    @DisplayName("219 Contains Duplicate II")
    void containsNearbyDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }
}