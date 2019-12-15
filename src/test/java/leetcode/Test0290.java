package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0290 {

    private final Solution0290 solution = new Solution0290();

    @Test
    @DisplayName("290 Word Pattern")
    void wordPattern() {
        String pattern = "abba";
        String str = "dog cat cat dog";
        assertTrue(solution.wordPattern(pattern, str));
        pattern = "abba";
        str = "dog dog dog dog";
        assertFalse(solution.wordPattern(pattern, str));
    }
}