package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 */

class Test0945 {

    private final Solution0945 solution = new Solution0945();

    @Test
    @DisplayName("945 Minimum Increment To Make Array Unique")
    void minIncrementForUnique() {
        int[] A = {1, 2, 2};
        int expected = 1;
        assertEquals(expected, solution.minIncrementForUnique(A));
        A = new int[] {3, 2, 1, 2, 1, 7};
        expected = 6;
        assertEquals(expected, solution.minIncrementForUnique(A));
    }
}