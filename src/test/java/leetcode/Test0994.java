package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/28
 */

class Test0994 {

    private final Solution0994 solution = new Solution0994();

    @Test
    @DisplayName("994 Rotting Oranges")
    void orangesRotting() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int expected = 4;
        assertEquals(expected, solution.orangesRotting(grid));
        grid = new int[][] {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        expected = -1;
        assertEquals(expected, solution.orangesRotting(grid));
        grid = new int[][] {{0, 2}};
        expected = 0;
        assertEquals(expected, solution.orangesRotting(grid));
    }
}