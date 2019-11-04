package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/1
 */

class Test11 {

    private final Solution0011 solution = new Solution0011();

    @Test
    @DisplayName("11 Container with Most Water")
    void testSolution11() {
        int[] input = {1, 8, 6, 2, 5, 3, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, solution.maxArea(input));
    }

}
