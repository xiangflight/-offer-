package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/5
 */

class Test1143 {

    private final Solution1143 solution = new Solution1143();

    @Test
    @DisplayName("1143 最长公共子序列")
    void longestCommonSubsequence() {
        String text1 = "abcde", text2 = "ace";
        int expected = 3;
        assertEquals(expected, solution.longestCommonSubsequence(text1, text2));
    }
}