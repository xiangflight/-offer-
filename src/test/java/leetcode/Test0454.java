package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0454 {

    private final Solution0454 solution = new Solution0454();

    @Test
    @DisplayName("454 4Sum II")
    void fourSumCount() {
        int expected = 2;
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        assertEquals(expected, solution.fourSumCount(a, b, c, d));
    }

    @Test
    @DisplayName("454 4Sum II")
    void fourSumCountAnother() {
        int expected = 2;
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        assertEquals(expected, solution.fourSumCountAnother(a, b, c, d));
    }
}