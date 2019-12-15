package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0242 {

    private final Solution0242 solution = new Solution0242();

    @Test
    @DisplayName("242 Valid Anagram")
    void isAnagram() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(solution.isAnagram(s, t));
        s = "rat";
        t = "car";
        assertFalse(solution.isAnagram(s, t));
    }
}