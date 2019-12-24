package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/23
 */

class Test0213 {

    private final Solution0213 solution = new Solution0213();

    @Test
    @DisplayName("213 House Robber II")
    void rob() {
        int[] input = {2, 3, 2};
        int expected = 3;
        assertEquals(expected, solution.rob(input));
    }
}