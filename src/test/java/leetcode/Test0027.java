package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0027 {

    private final Solution0027 solution = new Solution0027();

    @Test
    @DisplayName("27 Remove Element")
    void removeElement() {
        int[] origin = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        assertEquals(expected, solution.removeElement(origin, val));
    }
}