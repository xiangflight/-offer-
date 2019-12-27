package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/26
 */

class Test0096 {


    private final Solution0096 solution = new Solution0096();

    @Test
    @DisplayName("96 Unique Binary Search Trees")
    void numTrees() {
        int expected = 5;
        int input = 3;
        assertEquals(expected, solution.numTrees(input));
    }
}