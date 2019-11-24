package algo.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 */

class SelectionSortTest {

    @Test
    @DisplayName("Selection Sort")
    void sortAscend() {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {5, 3, 1, 23, 4, 5, 3, 21, 1};
        int[] expected = {1, 1, 3, 3, 4, 5, 5, 21, 23};
        selectionSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}