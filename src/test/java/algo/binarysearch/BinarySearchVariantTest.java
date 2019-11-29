package algo.binarysearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/27
 */

class BinarySearchVariantTest {

    private int[] arr;
    private int[] brr;
    private int target;

    @BeforeEach
    void setUp() {
        arr = new int[] {1, 2, 3, 5, 5, 6, 11, 19, 23, 27, 27, 27, 33, 45, 55, 67, 98};
        brr = new int[] {1, 2, 3, 5, 5, 6, 11, 19, 23, 33, 45, 55, 67, 98};
        target = 27;
    }

    @Test
    @DisplayName("Find First Matching Value")
    void findFirstMatchValue() {
        BinarySearchVariant binarySearchVariant = new BinarySearchVariant();
        int ans = binarySearchVariant.findFirstMatchValue(arr, target);
        assertEquals(9, ans);
    }

    @Test
    @DisplayName("Find Last Matching Value")
    void findLastMatchValue() {
        BinarySearchVariant binarySearchVariant = new BinarySearchVariant();
        int ans = binarySearchVariant.findLastMatchValue(arr, target);
        assertEquals(11, ans);
    }

    @Test
    @DisplayName("Find First Larger or Equivalent value")
    void findFirstLargerOrEqualValue() {
        BinarySearchVariant binarySearchVariant = new BinarySearchVariant();
        int actual = binarySearchVariant.findFirstLargerOrEqual(brr, target);
        assertEquals(9, actual);
    }

    @Test
    @DisplayName("Find Last Lesser or Equivalent value")
    void findLastLesserOrEqualValue() {
        BinarySearchVariant binarySearchVariant = new BinarySearchVariant();
        int actual = binarySearchVariant.findLastLessOrEqual(brr, target);
        assertEquals(8, actual);
    }
}