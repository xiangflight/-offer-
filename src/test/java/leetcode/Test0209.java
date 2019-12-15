package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0209 {

    private Solution0209 solution = new Solution0209();

    @Test
    @DisplayName("209 Minimum Size Subarray Sum")
    void minSubArrayLen() {
        int expected = 2;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        assertEquals(expected, solution.minSubArrayLen(s, nums));
    }

    @Test
    @DisplayName("209 Minimum Size Subarray Sum")
    void minSubArrayLenPerf() {
        int expected = 2;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        assertEquals(expected, solution.minSubArrayLenPerf(s, nums));
    }
}