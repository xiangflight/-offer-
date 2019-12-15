package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0016 {

    private final Solution0016 solution = new Solution0016();

    @Test
    @DisplayName("16 3Sum Closest")
    void threeSumClosest() {
        int expected = 2;
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        assertEquals(expected, solution.threeSumClosest(nums, target));
    }
}