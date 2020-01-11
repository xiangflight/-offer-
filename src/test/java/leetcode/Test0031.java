package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/11
 */

class Test0031 {

    private final Solution0031 solution = new Solution0031();

    @Test
    @DisplayName("31 Next Permutation")
    void nextPermutation() {
        int[] nums = {3, 2, 1};
        solution.nextPermutation(nums);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, nums);

        nums = new int[] {1, 2, 3};
        solution.nextPermutation(nums);
        expected = new int[] {1, 3, 2};
        assertArrayEquals(expected, nums);

        nums = new int[] {1, 1, 5};
        solution.nextPermutation(nums);
        expected = new int[] {1, 5, 1};
        assertArrayEquals(expected, nums);

        nums = new int[] {2, 3, 1};
        solution.nextPermutation(nums);
        expected = new int[] {3, 1, 2};
        assertArrayEquals(expected, nums);
    }
}