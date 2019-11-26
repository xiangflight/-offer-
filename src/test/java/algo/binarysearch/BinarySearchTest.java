package algo.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/26
 */

class BinarySearchTest {

    private int[] arr;
    private int target;

    @BeforeEach
    void beforeTest() {
        arr = new int[]{8, 11, 19, 23, 27, 33, 45, 55, 67, 98};
        target = 19;
    }


    @Test
    @DisplayName("Binary Search Non-Recursion")
    void bSearchImpl1() {
        BinarySearch bSearch = new BinarySearch();
        assertEquals(2, bSearch.bSearchImpl1(arr, target));
    }

    @Test
    @DisplayName("Binary Search Recursion")
    void bSearchImpl2() {
        BinarySearch bSearch = new BinarySearch();
        assertEquals(2, bSearch.bSearchImpl2(arr, target));
    }
}