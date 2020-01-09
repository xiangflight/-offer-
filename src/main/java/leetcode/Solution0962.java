package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 * <p>
 * Given an array A of integers, a ramp is a tuple (i, j) for which i < j and A[i] <= A[j]. 
 * The width of such a ramp is j - i.
 * <p>
 * Find the maximum width of a ramp in A.  If one doesn't exist, return 0.
 */

public class Solution0962 {

    /**
     * Time Complexity: O(n^2)
     * Space Complexity: in-place
     *
     * @param A 输入数组
     * @return 最长斜坡宽度
     */
    public int maxWidthRamp(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] <= A[j]) {
                    res = Math.max(res, j - i);
                }
            }
        }
        return res;
    }

    /**
     * keep a decreasing stack
     * <p>
     * for each number, binary search the first smaller number in the stack
     * <p>
     * when the number is smaller than the last, push it into the stack
     * <p>
     * Time Complexity: O(nlogn)
     * Space Complexity: O(n)
     *
     * @param A 输入数组
     * @return 最长斜坡宽度
     */
    public int maxWidthRampPerf(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        List<Integer> s = new ArrayList<>();
        int res = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            if (s.isEmpty() || A[i] < A[s.get(s.size() - 1)]) {
                s.add(i);
            } else {
                int lo = 0, hi = s.size() - 1;
                while (lo < hi) {
                    int mid = lo + ((hi - lo) >>> 1);
                    if (A[s.get(mid)] > A[i]) {
                        lo = mid + 1;
                    } else {
                        hi = mid;
                    }
                }
                res = Math.max(res, i - s.get(lo));
            }
        }
        return res;
    }

    /**
     * Still one pass and keep a decreasing stack
     *
     * Time Complexity: O(N)
     *
     * @param A 输入数组
     * @return 最长斜坡宽度
     */
    public int maxWidthRampUsingStack(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Stack<Integer> s = new Stack<>();
        int res = 0, n = A.length;
        for (int i = 0; i < n; i++) {
            if (s.isEmpty() || A[s.peek()] > A[i]) {
                s.add(i);
            }
        }
        for (int i = n - 1; i > res; --i) {
            while (!s.isEmpty() && A[s.peek()] <= A[i]) {
                res = Math.max(res, i - s.pop());
            }
        }
        return res;
    }



}
