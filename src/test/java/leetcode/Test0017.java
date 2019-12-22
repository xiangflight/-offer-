package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

class Test0017 {

    private final Solution0017 solution = new Solution0017();

    @Test
    @DisplayName("17 Letter Combinations of a Phone Number")
    void letterCombinations() {
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        String digits = "23";
        assertEquals(expected, solution.letterCombinations(digits));
    }
}