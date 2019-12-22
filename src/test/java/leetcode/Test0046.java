package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

class Test0046 {

    private final Solution0046 solution = new Solution0046();

    @Test
    @DisplayName("46 Permutations")
    void permute() {
        List<List<Integer>> expected =
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(1, 3, 2),
                        Arrays.asList(2, 1, 3),
                        Arrays.asList(2, 3, 1),
                        Arrays.asList(3, 1, 2),
                        Arrays.asList(3, 2, 1)
                );
        int[] nums = {1, 2, 3};
        assertEquals(expected, solution.permute(nums));
    }
}