package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

class Test0062 {

    private final Solution0062 solution = new Solution0062();

    @Test
    @DisplayName("62 Unique Paths")
    void uniquePaths() {
        int m = 3, n = 2;
        int expected = 3;
        assertEquals(expected, solution.uniquePaths(m, n));
        m = 7;
        n = 3;
        expected = 28;
        assertEquals(expected, solution.uniquePaths(m, n));
    }
}