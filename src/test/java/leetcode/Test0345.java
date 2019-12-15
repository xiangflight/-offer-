package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

class Test0345 {

    private Solution0345 solution = new Solution0345();

    @Test
    @DisplayName("345 Reverse Vowels of a String")
    void reverseVowels() {
        String expected = "holle";
        String input = "hello";
        assertEquals(expected, solution.reverseVowels(input));
    }
}