package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

class Test0008 {

    private final Solution0008 solution = new Solution0008();

    @Test
    @DisplayName("8 String to Integer (atoi)")
    void myAtoi() {
        int expected = 42;
        String input = "42";
        assertEquals(expected, solution.myAtoi(input));
        input = "     -42";
        expected = -42;
        assertEquals(expected, solution.myAtoi(input));
        input = "4193 with words";
        expected = 4193;
        assertEquals(expected, solution.myAtoi(input));
        input = "words and 987";
        expected = 0;
        assertEquals(expected, solution.myAtoi(input));
        input = "-91283472332";
        expected = -2147483648;
        assertEquals(expected, solution.myAtoi(input));
    }
}