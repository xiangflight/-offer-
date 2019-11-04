package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */



class SearchInSortedMatrix {

    /**
     * target 值在二维数组 matrix 中是否存在
     *
     * @param matrix 二维数组
     * @param target 目标数
     * @return 是否存在
     */
    boolean exist(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = m - 1, col = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }

}
