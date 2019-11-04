package swordoffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

public class Test04 {

    private final SearchInSortedMatrix searchInSortedMatrix = new SearchInSortedMatrix();

    @Test
    @DisplayName("Search In 2D Array")
    void testSearch() {
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int target = 4;
        assertTrue(searchInSortedMatrix.exist(matrix, target));
        target = 0;
        assertFalse(searchInSortedMatrix.exist(matrix, target));
        target = 20;
        assertFalse(searchInSortedMatrix.exist(matrix, target));
        target = 10;
        assertTrue(searchInSortedMatrix.exist(matrix, target));
    }

}
