package interview.bytedance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/26
 */

class Test0004 {

    private final Solution0004 solution = new Solution0004();

    @Test
    @DisplayName("大数相乘")
    void multiply() {
        String num1 = "99";
        String num2 = "99";
        String expected = "9801";
        assertEquals(expected, solution.multiply(num1, num2));
    }

    @Test
    @DisplayName("大数相加")
    void add() {
        String num1 = "99";
        String num2 = "99";
        String expected = "198";
        assertEquals(expected, solution.add(num1, num2));
    }
}