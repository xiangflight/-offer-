package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

class Test0026 {

    private final Solution0026 solution = new Solution0026();

    @Test
    @DisplayName("26 Remove Duplicates from Sorted Array")
    void removeDuplicates() {
        int expected = 5;
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(expected, solution.removeDuplicates(input));
    }

    @Test
    @DisplayName("26 Remove Duplicates from Sorted Array")
    void removeDuplicatesAnotherTest() {
        int expected = 5;
        int[] input = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(expected, solution.removeDuplicatesBetter(input));
    }
}