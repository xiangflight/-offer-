package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0075 {

    private final Solution0075 solution = new Solution0075();

    @Test
    @DisplayName("75 Sort Colors")
    void sortColors() {
        int[] expected = {0, 0, 1, 1, 2, 2};
        int[] input = {2, 0, 2, 1, 1, 0};
        solution.sortColors(input);
        assertArrayEquals(expected, input);
    }

    @Test
    @DisplayName("75 Sort Colors")
    void sortColorsCountSort() {
        int[] expected = {0, 0, 1, 1, 2, 2};
        int[] input = {2, 0, 2, 1, 1, 0};
        solution.sortColorsCountSort(input);
        assertArrayEquals(expected, input);
    }
}