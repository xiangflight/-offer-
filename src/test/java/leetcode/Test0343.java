package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

class Test0343 {

    private final Solution0343 solution = new Solution0343();

    @Test
    @DisplayName("343 Integer Break")
    void integerBreak() {
        int expected = 1;
        int input = 2;
        assertEquals(expected, solution.integerBreak(input));
        assertEquals(expected, solution.integerBreakDp(input));
        expected = 36;
        input = 10;
        assertEquals(expected, solution.integerBreak(input));
        assertEquals(expected, solution.integerBreakDp(input));
    }
}