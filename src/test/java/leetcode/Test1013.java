package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/11
 */

class Test1013 {

    private final Solution1013 solution = new Solution1013();

    @Test
    @DisplayName("1103 Can Three Parts Equal Sum")
    void canThreePartsEqualSum() {
        int[] arr = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        assertTrue(solution.canThreePartsEqualSum(arr));
        arr = new int[] {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
        assertFalse(solution.canThreePartsEqualSum(arr));
        arr = new int[] {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
        assertTrue(solution.canThreePartsEqualSum(arr));
        arr = new int[] {1, -1, 1, -1};
        assertFalse(solution.canThreePartsEqualSum(arr));
    }
}