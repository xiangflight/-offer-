package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

class Test0070 {

    private final Solution0070 solution = new Solution0070();

    @Test
    @DisplayName("70 Climbing Stairs")
    void climbStairs() {
        int input = 2;
        int expected = 2;
        assertEquals(expected, solution.climbStairs(input));
        input =3;
        expected = 3;
        assertEquals(expected, solution.climbStairs(input));
        assertEquals(expected, solution.climbStairsRecursive(input));
    }
}