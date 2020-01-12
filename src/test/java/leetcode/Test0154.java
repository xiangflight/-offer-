package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/12
 */

class Test0154 {

    private final Solution0154 solution = new Solution0154();

    @Test
    @DisplayName("Find Minimum in Rotated Sorted Array II")
    void findMin() {
        int[] nums = {1, 3, 5};
        int expected = 1;
        assertEquals(expected, solution.findMin(nums));
        nums = new int[] {2, 2, 2, 0, 1};
        expected = 0;
        assertEquals(expected, solution.findMin(nums));
    }
}