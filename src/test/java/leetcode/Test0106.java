package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/16
 */

class Test0106 {

    private final Solution0106 solution = new Solution0106();

    @Test
    @DisplayName("String Compression")
    void compressString() {
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        assertEquals(expected, solution.compressString(input));
        input = "abbccd";
        expected = "abbccd";
        assertEquals(expected, solution.compressString(input));
    }
}