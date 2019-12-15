package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0344 {

    private final Solution0344 solution = new Solution0344();

    @Test
    @DisplayName("344 Reverse String")
    void reverseString() {
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(input);
        assertArrayEquals(expected, input);
    }
}