package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/9
 */

class Test0121 {

    private final Solution0121 solution = new Solution0121();

    @Test
    @DisplayName("Best Time To Buy and Sell Stock")
    void maxProfit() {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        assertEquals(expected, solution.maxProfit(arr));
        arr = new int[] {7, 6, 4, 3, 1};
        expected = 0;
        assertEquals(expected, solution.maxProfit(arr));
    }
}