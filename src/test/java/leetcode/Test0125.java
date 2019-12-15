package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0125 {

    private final Solution0125 solution = new Solution0125();

    @Test
    @DisplayName("125 Valid Palindrome")
    void isPalindrome() {
        String input = "A man, a plan, a canal: Panama";
        assertTrue(solution.isPalindrome(input));
        input = "race a car";
        assertFalse(solution.isPalindrome(input));
        input = "0P";
        assertFalse(solution.isPalindrome(input));
    }
}