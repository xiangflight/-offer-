package swordoffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class Test03 {

    private RepeatedNumber repeatedNumber = new RepeatedNumber();

    @Test
    void testRepeatedNumber() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = 2;
        testRepeatedNumUsingHashtable(arr, ret);
        testRepeatedNumUsingSorting(arr, ret);
        testRepeatedNumberInPlace(arr, ret);
    }

    void testRepeatedNumUsingHashtable(int[] arr, int expected) {
        assertEquals(repeatedNumber.repeatedUsingHashtable(arr), expected);
    }

    void testRepeatedNumUsingSorting(int[] arr, int expected) {
        assertEquals(repeatedNumber.repeatedUsingSorting(arr), expected);
    }

    void testRepeatedNumberInPlace(int[] arr, int expected) {
        assertEquals(repeatedNumber.repeatedInPlace(arr), expected);
    }

}
