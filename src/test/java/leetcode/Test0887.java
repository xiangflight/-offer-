package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

class Test0887 {

    private final Solution0887 solution = new Solution0887();

    @ParameterizedTest(name = "Super Egg Drop")
    @CsvSource({
            "1, 2, 2",
            "2, 6, 3",
            "3, 14, 4"
    })
    void superEggDrop(int K, int N, int expected) {
        assertEquals(expected, solution.superEggDrop(K, N));
    }
}