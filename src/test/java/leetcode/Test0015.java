package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0015 {

    private final Solution0015 solution = new Solution0015();

    @Test
    @DisplayName("15 3Sum")
    void threeSum() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        int[] nums = {-1, 0, 1, 2, -1, -4};
        assertEquals(expected, solution.threeSum(nums));
    }
}