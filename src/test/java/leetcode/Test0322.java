package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

class Test0322 {

    private final Solution0322 solution = new Solution0322();

    @Test
    @DisplayName("322 Coin Change")
    void coinChange() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;
        assertEquals(expected, solution.coinChange(coins, amount));
        coins = new int[] {2};
        amount = 3;
        expected = -1;
        assertEquals(expected, solution.coinChange(coins, amount));
    }
}