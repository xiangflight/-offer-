package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0205 {

    private final Solution0205 solution = new Solution0205();

    @Test
    @DisplayName("205 Isomorphic Strings")
    void isIsomorphic() {
        String s = "egg";
        String t = "add";
        assertTrue(solution.isIsomorphic(s, t));
    }
}