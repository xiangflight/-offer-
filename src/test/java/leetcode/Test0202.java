package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0202 {

    private final Solution0202 solution = new Solution0202();

    @Test
    @DisplayName("202 Happy Number")
    void isHappy() {
        int input = 19;
        assertTrue(solution.isHappy(input));
    }
}