package algo.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 */

class QuickSortTest {

    @Test
    @DisplayName("Quick Sort")
    void sortAscend() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 3, 1, 23, 4, 5, 3, 21, 1};
        int[] expected = {1, 1, 3, 3, 4, 5, 5, 21, 23};
        quickSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}