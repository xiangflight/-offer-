package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/3
 *
 * 输入:
 * A = [1,2,3,0,0,0], m = 3
 * B = [2,5,6],       n = 3
 *
 * A = [1,2,3,0,5,6]
 *
 * 输出: [1,2,2,3,5,6]
 */

public class Solution1001 {

    public void merge(int[] A, int m, int[] B, int n) {
        int p = m - 1, q = n - 1, l = m + n - 1;
        while (p >= 0 && q >= 0) {
            A[l--] = (A[p] > B[q]) ? A[p--]: B[q--];
        }
        while (q >= 0) {
            A[l--] = B[q--];
        }
    }

}
