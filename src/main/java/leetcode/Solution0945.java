package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 */

public class Solution0945 {

    public int minIncrementForUniqueOrdinary(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            while (set.contains(A[i])) {
                A[i]++;
                res++;
            }
            set.add(A[i]);
        }
        return res;
    }

    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int res = 0, need = 0;
        for (int val: A) {
            res += Math.max(need - val, 0);
            need = Math.max(val, need) + 1;
        }
        return res;
    }

}
