package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/22
 */

public class Test1053 {

    private final Solution1053 solution = new Solution1053();

    @Test
    void testSolution1053() {
        int[] input = {3, 2, 1};
        int[] output = {3, 1, 2};
        assertArrayEquals(output, solution.prevPermOpt1(input));

        input = new int[] {1, 1, 5};
        output = new int[] {1, 1, 5};
        assertArrayEquals(output, solution.prevPermOpt1(input));

        input = new int[] {1, 9, 4, 6, 7};
        output = new int[] {1, 7, 4, 6, 9};
        assertArrayEquals(output, solution.prevPermOpt1(input));

        input = new int[] {3, 1, 1, 3};
        output = new int[] {1, 3, 1, 3};
        assertArrayEquals(output, solution.prevPermOpt1(input));
    }

}
