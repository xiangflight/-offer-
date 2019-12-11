package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

class Test0007 {

    private final Solution0007 solution = new Solution0007();

    @ParameterizedTest(name = "Reverse Integer {0} to {1}")
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "1534236469, 0"
    })
    void TestSolution7(int input, int expected) {
        assertEquals(expected, solution.reverse(input));
    }

    @ParameterizedTest(name = "official Reverse Integer {0} to {1}")
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "1534236469, 0"
    })
    void TestSolution7Official(int input, int expected) {
        assertEquals(expected, solution.reverseOfficial(input));
    }

    @ParameterizedTest(name = "official Reverse Integer {0} to {1}")
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "1534236469, 0"
    })
    void TestSolution7Third(int input, int expected) {
        assertEquals(expected, solution.reverseThird(input));
    }


}
