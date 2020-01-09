package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

class Test0962 {

    private final Solution0962 solution = new Solution0962();

    @Test
    @DisplayName("962 Maximum Width Ramp")
    void maxWidthRamp() {
        int[] A = {6, 0, 8, 2, 1, 5};
        int expected = 4;
        assertEquals(expected, solution.maxWidthRamp(A));
        A = new int[] {9, 8, 1, 0, 1, 9, 4, 0, 4, 1};
        expected = 7;
        assertEquals(expected, solution.maxWidthRamp(A));
    }
}