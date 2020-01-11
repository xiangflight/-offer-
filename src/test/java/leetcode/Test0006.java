package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/11
 */

class Test0006 {

    private final Solution0006 solution = new Solution0006();

    @Test
    @DisplayName("6 ZigZag Conversion")
    void convert() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, solution.convert(s, numRows));
        s = "PAYPALISHIRING";
        numRows = 4;
        expected = "PINALSIGYAHRPI";
        assertEquals(expected, solution.convert(s, numRows));
    }
}