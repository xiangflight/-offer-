package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/12
 */

class Test0153 {

    private final Solution0153 solution = new Solution0153();

    @Test
    @DisplayName("Find Minimum in Rotated Sorted Array")
    void findMin() {
        int[] nums = {3, 4, 5, 1, 2};
        int expected = 1;
        assertEquals(expected, solution.findMin(nums));
        nums = new int[] {4, 5, 6, 7, 0, 1, 2};
        expected = 0;
        assertEquals(expected, solution.findMin(nums));
    }
}