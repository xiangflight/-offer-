package leetcode;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/6
 * <p>
 * 566 Reshape the Matrix
 */

public class Solution0566 {

    /**
     * 二维数组的本质还是一维数组
     * <p>
     * 使用除法和取模 res[count/c][count%c]
     *
     * @param nums 输入数组
     * @param r    行
     * @param c    列
     * @return 调整后的数组
     */
    public int[][] matrixReshapeUsingMod(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
            return nums;
        }
        int count = 0;
        for (int[] num : nums) {
            for (int j = 0; j < nums[0].length; j++) {
                res[count / c][count % c] = num[j];
                count++;
            }
        }
        return res;
    }

    /**
     * Time Complexity: O(m * n)
     * Space Complexity: O(m * n)
     *
     * @param nums 输入数组
     * @param r    行
     * @param c    列
     * @return 调整后的数组
     */
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null) {
            return null;
        }
        int m = nums.length;
        assert m > 0;
        int n = nums[0].length;
        if (r * c != m * n) {
            return nums;
        }
        int row, column;
        row = column = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][column] = nums[i][j];
                column = (column + 1) % c;
                if (column == 0) {
                    row++;
                }
            }
        }
        return res;
    }

    /**
     * 使用队列
     *
     * @param nums 输入数组
     * @param r    行
     * @param c    列
     * @return 调整后的数组
     */
    public int[][] matrixReshapeUsingQueue(int[][] nums, int r, int c) {
        if (Objects.isNull(nums)) {
            return null;
        }
        int m = nums.length;
        assert m > 0;
        int n = nums[0].length;
        if (r * c != m * n) {
            return nums;
        }
        int[][] res = new int[r][c];
        Queue<Integer> queue = new LinkedList<>();
        for (int[] num : nums) {
            for (int j = 0; j < n; j++) {
                queue.add(num[j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }
}
