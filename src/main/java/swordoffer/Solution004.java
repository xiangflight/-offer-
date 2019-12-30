package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution004 {

    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int m = array.length;
        int n = array[0].length;
        int i = m - 1, j = 0;
        while (i >= 0 && j < n) {
            if (array[i][j] == target) {
                return true;
            }
            if (array[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }

}
