package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/14
 */

class Test0093 {

    private final Solution0093 solution = new Solution0093();

    @Test
    @DisplayName("93 Restore IP Addresses")
    void restoreIpAddresses() {
        String s = "25525511135";
        List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertEquals(expected, solution.restoreIpAddresses(s));
    }
}