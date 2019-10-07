package coding_interviews.swordoffer;

import java.util.ArrayList;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-11 08:53
 *
 * 顺时针打印矩阵
 *
 */

public class Solution23 {

    /**
     * 题目：输入一个矩阵，按照从外到里以顺时针的顺序依次打印出每个数字。
     *      例如：输入以下矩阵：
     *      1  2  3  4
     *      5  6  7  8
     *      9  10 11 12
     *      13 14 15 16
     *
     *      则依次打印的数字为：1、2、3、4、8、12、16、15、14、13、9、5、6、7、11、10
     *
     *
     * @param matrix 矩阵
     * @return 从外到里打印的结果
     */
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        // 定义四周界限
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        // 依次顺时针打印
        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                // 从左到右打印
                result.add(matrix[up][i]);
            }
            for (int j = up + 1; j <= down; j++) {
                // 从右上到右下打印
                result.add(matrix[j][right]);
            }
            if (up != down) {
                // 如果没有上面的判断，则重复打印，从右下到左下打印
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
            }
            if (left != right) {
                // 需要保证有两列，从左下到左上打印
                for (int j = down - 1; j > up; j--) {
                    result.add(matrix[j][left]);
                }
            }
            // 更新四周边界
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }
}
