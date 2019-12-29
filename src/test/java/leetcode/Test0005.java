package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

class Test0005 {

    private final Solution0005 solution = new Solution0005();

    @Test
    @DisplayName("5 Longest Palindromic Substring")
    void longestPalindrome() {
        String input = "babad";
        String expected = "bab";
        assertEquals(expected, solution.longestPalindrome(input));
        input = "cbbd";
        expected = "bb";
        assertEquals(expected, solution.longestPalindrome(input));
    }
}