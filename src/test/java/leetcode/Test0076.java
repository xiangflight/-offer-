package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0076 {

    private final Solution0076 solution = new Solution0076();

    @Test
    @DisplayName("76 Minimum Window Substring")
    void minWindow() {
        String expected = "BANC";
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals(expected, solution.minWindow(s, t));
    }
}