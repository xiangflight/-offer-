package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0167 {

    private final Solution0167 solution = new Solution0167();

    @Test
    @DisplayName("167 Two Sum II - Input array is sorted")
    void twoSum() {
        int[] expected = {1, 2};
        int[] input = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(expected, solution.twoSum(input, target));
    }

    @Test
    @DisplayName("167 Two Sum II - Input array is sorted")
    void twoSumUsingBinarySearch() {
        int[] expected = {1, 2};
        int[] input = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(expected, solution.twoSumUsingBinarySearch(input, target));
    }
}