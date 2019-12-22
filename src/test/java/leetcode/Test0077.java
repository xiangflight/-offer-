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

class Test0077 {

    private final Solution0077 solution = new Solution0077();

    @Test
    @DisplayName("77 Combinations")
    void combine() {
        int n = 4, k = 2;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(1, 3), Arrays.asList(1, 4), Arrays.asList(2, 3), Arrays.asList(2, 4), Arrays.asList(3, 4));
        assertEquals(expected, solution.combine(n, k));
    }
}