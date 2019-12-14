package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0088 {

    private Solution0088 solution = new Solution0088();

    @Test
    @DisplayName("88 Merge Sorted Array")
    void merge() {
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(expected, nums1);
    }
}