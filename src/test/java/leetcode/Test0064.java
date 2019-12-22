package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

class Test0064 {

    private final Solution0064 solution = new Solution0064();

    @Test
    @DisplayName("64 Minimum Path Sum")
    void minPathSum() {
        int expected = 7;
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(expected, solution.minPathSum(grid));
    }
}