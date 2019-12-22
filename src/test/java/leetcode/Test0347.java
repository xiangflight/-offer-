package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/20
 */

class Test0347 {

    private final Solution0347 solution = new Solution0347();

    @Test
    @DisplayName("347 Top K Frequent Elements")
    void topKFrequent() {
        List<Integer> expected = Arrays.asList(2, 1);
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        assertEquals(expected, solution.topKFrequent(nums, k));
        nums = new int[]{4, 1, -1, 2, -1, 2, 3};
        k = 2;
        expected = Arrays.asList(2, -1);
        assertEquals(expected, solution.topKFrequent(nums, k));
    }
}