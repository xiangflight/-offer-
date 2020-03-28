package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/28
 */

class Test0820 {

    private final Solution0820 solution = new Solution0820();

    @Test
    @DisplayName("Short-Encoding-Of-Words")
    void minimumLengthEncoding() {
        String[] words = {"time", "me", "bell"};
        int expected = 10;
        assertEquals(expected, solution.minimumLengthEncoding(words));
    }
}