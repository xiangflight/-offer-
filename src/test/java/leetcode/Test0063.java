package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

class Test0063 {

    private final Solution0063 solution = new Solution0063();

    @Test
    @DisplayName("63 Unique Paths II")
    void uniquePathsWithObstacles() {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;
        assertEquals(expected, solution.uniquePathsWithObstacles(obstacleGrid));

    }
}