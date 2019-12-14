package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0215 {

    private final Solution0215 solution = new Solution0215();

    @Test
    @DisplayName("215 Kth Largest Element in an Array")
    void findKthLargest() {
        int expected = 5;
        int k = 2;
        int[] input = {3, 2, 1, 5, 6, 4};
        assertEquals(expected, solution.findKthLargest(input, k));
    }
}