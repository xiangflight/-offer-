package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/11
 */

class Test0047 {

    private final Solution0047 solution = new Solution0047();

    @Test
    @DisplayName("47 Permutations II")
    void permuteUnique() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1));
        assertEquals(expected, solution.permuteUnique(nums));
    }
}