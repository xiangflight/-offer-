package swordoffer;

import java.util.ArrayList;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution029 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        if (m == 0) {
            return ans;
        }
        int upper = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[upper][i]);
            }
            if (++upper > down) {
                break;
            }
            for (int i = upper; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                ans.add(matrix[down][i]);
            }
            if (--down < upper) {
                break;
            }
            for (int i = down; i >= upper; i--) {
                ans.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return ans;
    }

    public ArrayList<Integer> printMatrix2(int [][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int upper = 0, down = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (upper <= down && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[upper][i]);
            }
            for (int i = upper + 1; i <= down; i++) {
                ans.add(matrix[i][right]);
            }
            if (upper != down) {
                for (int i = right - 1; i >= left; i--) {
                    ans.add(matrix[down][i]);
                }
            }
            if (left != right) {
                for (int i = down - 1; i > upper; i--) {
                    ans.add(matrix[i][left]);
                }
            }
            upper++;
            down--;
            left++;
            right--;
        }

        return ans;
    }

}
