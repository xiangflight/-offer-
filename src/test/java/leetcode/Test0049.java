package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

class Test0049 {

    private final Solution0049 solution = new Solution0049();

    @Test
    @DisplayName("49 Group Anagrams")
    void groupAnagrams() {
        List<List<Object>> expected = Arrays.asList(Arrays.asList("eat", "tea", "ate"), Arrays.asList("tan", "nat"), Arrays.asList("bat"));
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(expected, solution.groupAnagrams(input));
    }
}