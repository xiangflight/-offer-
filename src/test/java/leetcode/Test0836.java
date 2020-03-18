package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/18
 */

class Test0836 {

    private final Solution0836 solution = new Solution0836();

    @Test
    @DisplayName("Rectangle Overlap")
    void isRectangleOverlap() {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        assertTrue(solution.isRectangleOverlap(rec1, rec2));
        rec1 = new int[] {0, 0, 1, 1};
        rec2 = new int[] {1, 0, 2, 1};
        assertFalse(solution.isRectangleOverlap(rec1, rec2));
    }
}