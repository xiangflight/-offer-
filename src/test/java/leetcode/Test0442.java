package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/11
 */

class Test0442 {

    private final Solution0442 solution = new Solution0442();

    @Test
    @DisplayName("442 Find All Duplicates in an Array")
    void findDuplicates() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> expected = Arrays.asList(3, 2);
        assertEquals(expected, solution.findDuplicates(nums));
    }
}