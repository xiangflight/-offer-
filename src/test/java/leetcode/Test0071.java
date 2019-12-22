package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

class Test0071 {

    private final Solution0071 solution = new Solution0071();

    @Test
    @DisplayName("71 Simplify Path")
    void simplifyPath() {
        String path = "/home/";
        String expected = "/home";
        assertEquals(expected, solution.simplifyPath(path));
    }
}