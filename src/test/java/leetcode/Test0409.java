package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/19
 *
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 */

class Test0409 {

    private final Solution0409 solution = new Solution0409();

    @Test
    @DisplayName("409 Longest Palindrome")
    void longestPalindrome() {
        String s = "abccccdd";
        int expected = 7;
        assertEquals(expected, solution.longestPalindrome(s));
    }
}