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
    @DisplayName("3 Repeated number in array")
    void testRepeatedNum() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = repeatedNumber.repeated(arr);
        assertEquals(ret, 2);
    }

}
