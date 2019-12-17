package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0217 {

    private final Solution0217 solution = new Solution0217();

    @Test
    @DisplayName("217 Contains Duplicate")
    void containsDuplicate() {
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums));
    }
}