package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Test1 {

    private final Solution0001 solution = new Solution0001();

    @Test
    @DisplayName("1 Two Sum")
    void testSolution1() {
        int[] expected = {0, 1};
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }

}
