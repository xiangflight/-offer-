package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0438 {

    private final Solution0438 solution = new Solution0438();

    @Test
    @DisplayName("438 Find All Anagrams in a String")
    void findAnagrams() {
        List<Integer> expected = Arrays.asList(0, 6);
        String s = "cbaebabacd";
        String p = "abc";
        assertEquals(expected, solution.findAnagrams(s, p));
    }
}