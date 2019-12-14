package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0080 {

    private final Solution0080 solution = new Solution0080();

    @Test
    @DisplayName("Remove Duplicates from Sorted Array II")
    void removeDuplicates() {
        int[] input = {1, 1, 1, 2, 2, 3};
        int expected = 5;
        assertEquals(expected, solution.removeDuplicates(input));
    }
}