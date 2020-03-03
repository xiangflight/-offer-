package cc189;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/3
 */

class Test1001 {

    private final Solution1001 solution = new Solution1001();

    @Test
    @DisplayName("Merge Sorted Array")
    void merge() {
        int[] A = {1, 2, 3, 0, 0, 0};
        int[] B = {2, 5, 6};
        solution.merge(A, 3, B, 3);
        assertArrayEquals(A, new int[] {1, 2, 2, 3, 5, 6});
    }
}