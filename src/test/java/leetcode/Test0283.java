package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0283 {

    private final Solution0283 solution = new Solution0283();

    @Test
    @DisplayName("Move Zeroes")
    void moveZeroes() {
        int[] origin = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(origin);
        assertArrayEquals(expected, origin);
    }

    @Test
    @DisplayName("Move Zeroes")
    void moveZeroesSwapBased() {
        int[] origin = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroesSwapBased(origin);
        assertArrayEquals(expected, origin);
    }
}