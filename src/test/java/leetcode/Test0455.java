package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

class Test0455 {

    private final Solution0455 solution = new Solution0455();

    @Test
    @DisplayName("455 Assign Cookies")
    void findContentChildren() {
        int expected = 1;
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        assertEquals(expected, solution.findContentChildren(g, s));
        g = new int[] {1, 2};
        s = new int[] {1, 2, 3};
        expected = 2;
        assertEquals(expected, solution.findContentChildren(g, s));
    }
}