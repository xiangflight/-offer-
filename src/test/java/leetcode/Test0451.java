package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0451 {

    private final Solution0451 solution = new Solution0451();

    @Test
    @DisplayName("451 Sort Characters By Frequency")
    void frequencySort() {
        String input = "cccaaa";
        String expected = "aaaccc";
        assertEquals(expected, solution.frequencySort(input));
    }
}