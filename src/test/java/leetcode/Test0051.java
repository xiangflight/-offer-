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

class Test0051 {

    private final Solution0051 solution = new Solution0051();

    @Test
    @DisplayName("51 N-Queens")
    void solveNQueens() {
        int input = 4;
        List<List<String>> expected =
                Arrays.asList(Arrays.asList(".Q..", "...Q", "Q...", "..Q."), Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));
        assertEquals(expected, solution.solveNQueens(input));
    }
}