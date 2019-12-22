package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0149 {

    private final Solution0149 solution = new Solution0149();

    @Test
    @DisplayName("149 Max Points on a Line")
    void maxPoints() {
        int expected = 3;
        int[][] input = {{1, 1}, {2, 2}, {3, 3}};
        assertEquals(expected, solution.maxPoints(input));
    }
}