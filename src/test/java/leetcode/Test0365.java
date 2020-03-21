package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/21
 */

class Test0365 {

    private final Solution0365 solution = new Solution0365();

    @Test
    @DisplayName("365 Water And Jug Problem")
    void canMeasureWater() {
        int x = 3, y = 5, z = 4;
        assertTrue(solution.canMeasureWater(x, y, z));
        x = 2;
        y = 6;
        z = 5;
        assertFalse(solution.canMeasureWater(x, y, z));
    }
}