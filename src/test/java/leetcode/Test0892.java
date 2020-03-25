package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/25
 */

class Test0892 {

    private final Solution0892 solution = new Solution0892();

    @Test
    @DisplayName("892 Surface Area Of 3d Shape")
    void surfaceArea() {
        int[][] grid = {{2}};
        int expected = 10;
        assertEquals(expected, solution.surfaceArea(grid));

        grid = new int[][] {{1, 2}, {3, 4}};
        expected = 34;
        assertEquals(expected, solution.surfaceArea(grid));

        grid = new int[][] {{1, 0}, {0, 2}};
        expected = 16;
        assertEquals(expected, solution.surfaceArea(grid));

        grid = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        expected = 32;
        assertEquals(expected, solution.surfaceArea(grid));
    }
}