package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/6
 */

class Test0566 {

    private final Solution0566 solution = new Solution0566();

    @Test
    @DisplayName("566 Reshape the Matrix")
    void matrixReshape() {
        int[][] nums = {{1, 2}, {3, 4}};
        int r = 1, c = 4;
        int[][] expected = {{1, 2, 3, 4}};
        assertArrayEquals(expected, solution.matrixReshape(nums, r, c));
    }
}