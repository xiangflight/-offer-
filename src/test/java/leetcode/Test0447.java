package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0447 {

    private final Solution0447 solution = new Solution0447();

    @Test
    @DisplayName("447 Number of Boomeranges")
    void numberOfBoomerangs() {
        int expected = 2;
        int[][] input = {{0, 0}, {1, 0}, {2, 0}};
        assertEquals(expected, solution.numberOfBoomerangs(input));
    }
}