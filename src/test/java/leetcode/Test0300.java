package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

class Test0300 {

    private final Solution0300 solution = new Solution0300();

    @Test
    @DisplayName("300 Longest Increasing Subsequence")
    void lengthOfLIS() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int expected = 4;
        assertEquals(expected, solution.lengthOfLIS(nums));
    }
}