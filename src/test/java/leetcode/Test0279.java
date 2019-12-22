package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/19
 */

class Test0279 {

    private final Solution0279 solution = new Solution0279();

    @Test
    @DisplayName("279 Perfect Squares")
    void numSquares() {
        int expected = 3;
        int n = 12;
        assertEquals(expected, solution.numSquares(n));
    }
}