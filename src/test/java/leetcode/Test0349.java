package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0349 {

    private final Solution0349 solution = new Solution0349();

    @Test
    @DisplayName("349 Intersection of Two Arrays")
    void intersection() {
        int[] expected = {2};
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        assertArrayEquals(expected, solution.intersection(nums1, nums2));
    }
}