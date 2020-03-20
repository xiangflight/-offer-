package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/20
 */

class Test0040 {

    private final Solution0040 solution = new Solution0040();

    @Test
    @DisplayName("40 Minimum K Numbers")
    void getLeastNumbers() {
        int[] arr = {3, 2, 1};
        int k = 2;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.getLeastNumbers(arr, k));
        arr = new int[] {0, 1, 2, 1};
        k = 1;
        expected = new int[] {0};
        assertArrayEquals(expected, solution.getLeastNumbers(arr, k));
    }
}