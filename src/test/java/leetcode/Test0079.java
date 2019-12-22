package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

class Test0079 {

    private final Solution0079 solution = new Solution0079();

    @Test
    @DisplayName("79n Word Search")
    void exist() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        assertTrue(solution.exist(board, word));
        word = "SEE";
        assertTrue(solution.exist(board, word));
        word = "ABCB";
        assertFalse(solution.exist(board, word));
    }
}