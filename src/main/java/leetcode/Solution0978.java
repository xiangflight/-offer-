package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class Solution0978 {

    public int maxTurbulenceSizeClear(int[] A) {
        int pre = 0, cur = 0, len = 1, res = 1;
        for (int i = 1; i < A.length; i++) {
            cur = Integer.compare(A[i], A[i - 1]);
            if (cur * pre == -1) {
                len++;
            } else if (cur == 0) {
                len = 1;
            } else {
                len = 2;
            }
            res = Math.max(res, len);
            pre = cur;
        }
        return res;
    }

    public int maxTurbulenceSizeO1(int[] A) {
        int inc = 1, dec = 1, result = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) {
                dec = inc + 1;
                inc = 1;
            } else if (A[i] > A[i - 1]) {
                inc = dec + 1;
                dec = 1;
            } else {
                inc = 1;
                dec = 1;
            }
            result = Math.max(result, Math.max(dec, inc));
        }
        return result;
    }

    /**
     * 滑动窗口
     *
     * @param A 数组
     * @return 最长湍流子数组长度
     */
    public int maxTurbulenceSizeSlidingWindow(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int l = 0, r = 1;
        int res = 1;
        while (r < A.length) {
            int flag = Integer.compare(A[r - 1], A[r]);

            if ((r == A.length - 1) || (flag * Integer.compare(A[r], A[r + 1]) != -1)) {
                if (flag != 0) {
                    res = Math.max(res, r - l + 1);
                }
                l = r;
            }
            r++;
        }
        return res;
    }

    public int maxTurbulenceSizeDp(int[] A) {
        return 0;
    }

    /**
     * 朴素的方法求解
     * <p>
     * Time Complexity: O(n^3)
     * <p>
     * Time Limit Out
     *
     * @param A 数组
     * @return 最长湍流子数组长度
     */
    public int maxTurbulenceSize(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int n = A.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isTurbulent(i, j, A)) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    /**
     * 判断这一段长度的 array 是否是 turbulent
     * <p>
     * [9,4,2,10,7,8,8,1,9]
     *
     * @param start 开始位置
     * @param end   结束位置
     * @param A     数组
     * @return true if is turbulent
     */
    private static boolean isTurbulent(int start, int end, int[] A) {
        if (start == end) {
            return true;
        }
        boolean greater = A[start] > A[start + 1];
        for (int i = start; i < end; i++) {
            if (A[i] > A[i + 1] && greater) {
                greater = false;
            } else if (A[i] < A[i + 1] && !greater) {
                greater = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
