package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

class Test0034 {

    private final Solution0034 solution = new Solution0034();

    @Test
    @DisplayName("34 Find First and Last Position of Elements in Sorted Array")
    void searchRange() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] expected = {3, 4};
        assertArrayEquals(expected, solution.searchRange(nums, target));
        target = 6;
        expected = new int[] {-1, -1};
        assertArrayEquals(expected, solution.searchRange(nums, target));
    }
}