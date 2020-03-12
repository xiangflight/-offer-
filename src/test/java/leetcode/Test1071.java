package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/12
 */

class Test1071 {

    private final Solution1071 solution = new Solution1071();

    @Test
    @DisplayName("Gcd Of Strings")
    void gcdOfStrings() {
        String str1 = "ABCABC", str2 = "ABC";
        String expected = "ABC";
        assertEquals(expected, solution.gcdOfStrings(str1, str2));
        str1 = "ABABAB";
        str2 = "ABAB";
        expected = "AB";
        assertEquals(expected, solution.gcdOfStrings(str1, str2));
        str1 = "LEET";
        str2 = "CODE";
        expected = "";
        assertEquals(expected, solution.gcdOfStrings(str1, str2));
    }
}