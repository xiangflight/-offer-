package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

class Test0020 {

    private final Solution0020 solution = new Solution0020();

    @Test
    @DisplayName("20 Valid Parentheses")
    void isValid() {
        String input = "()[]{}";
        assertTrue(solution.isValid(input));
    }
}