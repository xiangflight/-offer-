package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/10
 */

class Test0717 {

    private final Solution0717 solution = new Solution0717();

    @Test
    @DisplayName("717 1-bit and 2-bit Characters")
    void isOneBitCharacter() {
        int[] bits = {1, 0, 0};
        assertTrue(solution.isOneBitCharacter(bits));
        bits = new int[] {1, 1, 1, 0};
        assertFalse(solution.isOneBitCharacter(bits));
    }
}