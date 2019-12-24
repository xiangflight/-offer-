package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/23
 */

class Test0198 {

    private final Solution0198 solution = new Solution0198();

    @Test
    @DisplayName("198 House Robber")
    void rob() {
        int expected = 4;
        int[] nums = {1, 2, 3, 1};
        assertEquals(expected, solution.rob(nums));
        expected = 12;
        nums = new int[] {2, 7, 9, 3, 1};
        assertEquals(expected, solution.rob(nums));
    }
}