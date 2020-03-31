package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/31
 */

class Test0912 {

    private final Solution0912 solution = new Solution0912();

    @Test
    @DisplayName("Sort An Array")
    void sortArray() {
        int[] nums = {5, 2, 3 ,1};
        int[] expected = {1, 2, 3, 5};
        assertArrayEquals(expected, solution.sortArray(nums));
        nums = new int[] {5, 1, 1, 2, 0, 0};
        expected = new int[] {0, 0, 1, 1, 2, 5};
        assertArrayEquals(expected, solution.sortArray(nums));
    }
}