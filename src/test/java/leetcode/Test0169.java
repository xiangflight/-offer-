package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/13
 */

class Test0169 {

    private final Solution0169 solution = new Solution0169();

    @Test
    @DisplayName("169 Majority Element")
    void majorityElement() {
        int[] nums = {3, 2, 3};
        int expected = 3;
        assertEquals(expected, solution.majorityElement(nums));
        nums = new int[] {2, 2, 1, 1, 1, 2, 2};
        expected = 2;
        assertEquals(expected, solution.majorityElement(nums));
    }
}