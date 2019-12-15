package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0350 {

    private final Solution0350 solution = new Solution0350();

    @Test
    @DisplayName("350 Intersection of Two Arrays II")
    void intersect() {
        int[] expected = {2, 2};
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        assertArrayEquals(expected, solution.intersect(nums1, nums2));
    }
}