package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0454 {

    private final Solution0454 solution = new Solution0454();

    @Test
    void fourSumCount() {
        int expected = 2;
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        assertEquals(expected, solution.fourSumCount(a, b, c, d));
    }
}