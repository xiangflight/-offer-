package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/24
 */

class Test0416 {

    private final Solution0416 solution = new Solution0416();

    @Test
    @DisplayName("416 Partition Equal Subset Sum")
    void canPartition() {
        int[] input = {1, 5, 11, 5};
        assertTrue(solution.canPartition(input));
        input = new int[] {1, 2, 3, 5};
        assertFalse(solution.canPartition(input));
    }
}