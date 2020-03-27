package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/27
 */

class Test0914 {

    private final Solution0914 solution = new Solution0914();

    @Test
    @DisplayName("914 X-Of-A-Kind-In-A-Deck")
    void hasGroupsSizeX() {
        int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
        assertTrue(solution.hasGroupsSizeX(deck));
        deck = new int[] {1, 1, 1, 2, 2, 2, 3, 3};
        assertFalse(solution.hasGroupsSizeX(deck));
        deck = new int[] {1};
        assertFalse(solution.hasGroupsSizeX(deck));
        deck = new int[] {1, 1};
        assertTrue(solution.hasGroupsSizeX(deck));
        deck = new int[] {1, 1, 2, 2, 2, 2};
        assertTrue(solution.hasGroupsSizeX(deck));
    }
}