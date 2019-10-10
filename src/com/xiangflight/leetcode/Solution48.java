package com.xiangflight.leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/10 8:19 上午
 */

public class Solution48 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution48().rotate(matrix);
        for (int[] ans : matrix) {
            System.out.println(Arrays.toString(ans));
        }
    }

    /**
     * divide into four sub array substitutions
     *
     * @param matrix matrix to rotate
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int layer = 0; layer < n / 2; layer++) {
            int end = n - 1 - layer;
            for (int i = layer; i < end; i++) {
                int offset = i - layer;
                int top = matrix[layer][i];
                // left -> top
                matrix[layer][i] = matrix[end - offset][layer];
                // bottom -> left
                matrix[end - offset][layer] = matrix[end][end - offset];
                // right -> bottom
                matrix[end][end - offset] = matrix[i][end];
                // top -> right
                matrix[i][end] = top;
            }
        }
    }

}
