package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Test0001 {

    private final Solution0001 solution = new Solution0001();

    @Test
    @DisplayName("1 Two Sum Prefer Memory")
    void testSolutionPreferMemory() {
        int[] expected = {0, 1};
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(expected, solution.twoSumPreferMemory(nums, target));
    }

    @Test
    @DisplayName("1 Two Sum Prefer Performance")
    void testSolutionPreferPerformance() {
        int[] expected = {0, 1};
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(expected, solution.twoSumPreferPerformance(nums, target));
    }

}
