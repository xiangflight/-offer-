package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/26
 */

class Test0435 {

    private final Solution0435 solution = new Solution0435();

    @Test
    @DisplayName("435 Non-overlapping Intervals")
    void eraseOverlapIntervals() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int expected = 1;
        assertEquals(expected, solution.eraseOverlapIntervals(intervals));
        intervals = new int[][] {{1, 2}, {1, 2}, {1, 2}};
        expected = 2;
        assertEquals(expected, solution.eraseOverlapIntervals(intervals));
        intervals = new int[][] {{1, 2}, {2, 3}};
        expected = 0;
        assertEquals(expected, solution.eraseOverlapIntervals(intervals));
    }
}