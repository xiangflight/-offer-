package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

class Test0120 {

    private final Solution0120 solution = new Solution0120();

    @Test
    @DisplayName("120 Triangle")
    void minimumTotal() {
        List<List<Integer>> triangle = Arrays.asList(Collections.singletonList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3));
        int expected = 11;
        assertEquals(expected, solution.minimumTotal(triangle));
    }
}