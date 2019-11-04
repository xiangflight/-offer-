package swordoffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class Test03 {

    private final RepeatedNumber repeatedNumber = new RepeatedNumber();
    private final DuplicateNumber duplicateNumber = new DuplicateNumber();

    @Test
    @DisplayName("Repeated Number Using Hashtable")
    void testRepeatedNumUsingHashtable() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = 2;
        assertEquals(repeatedNumber.repeatedUsingHashtable(arr), ret);
    }

    @Test
    @DisplayName("Repeated Number Using Sorting")
    void testRepeatedNumUsingSorting() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = 2;
        assertEquals(repeatedNumber.repeatedUsingSorting(arr), ret);
    }

    @Test
    @DisplayName("Repeated Number In Place")
    void testRepeatedNumberInPlace() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = 2;
        assertEquals(repeatedNumber.repeatedInPlace(arr), ret);
    }

    @Test
    @DisplayName("Repeated Number In Place Using Swap")
    void testRepeatedNumberInPlaceUsingSwap() {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        int ret = 2;
        assertEquals(repeatedNumber.repeatedInPlaceUsingSwap(arr), ret);
    }

    @Test
    @DisplayName("Repeated Number Using Divider And Conquer")
    void testDuplicateNumber() {
        int[] arr = {2, 3, 5, 4, 3, 2, 6, 7};
        int ret = 3;
        assertEquals(ret, duplicateNumber.duplicateNumInArr(arr));
    }

}
