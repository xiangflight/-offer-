package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0003 {

    private final Solution0003 solution = new Solution0003();

    @Test
    @DisplayName("3 Longest Substring Without Repeating Characters")
    void lengthOfLongestSubstring() {
        int expected = 3;
        String s = "abcabcbb";
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
        assertEquals(expected, solution.lengthOfLongestSubstring1(s));
    }
}