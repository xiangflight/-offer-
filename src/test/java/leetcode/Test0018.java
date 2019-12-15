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

class Test0018 {

    private final Solution0018 solution = new Solution0018();

    @Test
    @DisplayName("18 4Sum")
    void fourSum() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1));
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        assertEquals(expected, solution.fourSum(nums, target));
    }
}