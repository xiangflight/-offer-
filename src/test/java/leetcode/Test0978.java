package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

class Test0978 {

    private final Solution0978 solution = new Solution0978();

    @Test
    @DisplayName("978 Longest Turbulent Subarray")
    void maxTurbulenceSize() {
        int[] input = {9, 4, 2, 10, 7, 8, 8, 1, 9};
        int expected = 5;
        assertEquals(expected, solution.maxTurbulenceSize(input));
        input = new int[] {4, 8, 12, 16};
        expected = 2;
        assertEquals(expected, solution.maxTurbulenceSize(input));
        input = new int[] {100};
        expected = 1;
        assertEquals(expected, solution.maxTurbulenceSize(input));
    }
}