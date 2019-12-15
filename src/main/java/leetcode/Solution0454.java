package leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0454 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : C) {
            for (int i : D) {
                map.put(value + i, map.getOrDefault(value + i, 0) + 1);
            }
        }

        int res = 0;
        for (int value : A) {
            for (int i : B) {
                if (map.containsKey(-value - i)) {
                    res += map.get(-value - i);
                }
            }
        }
        return res;
    }

    public int fourSumCountAnother(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> mapAB = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                mapAB.put(A[i] + B[j], mapAB.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }

        HashMap<Integer, Integer> mapCD = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                mapCD.put(C[i] + D[j], mapCD.getOrDefault(C[i] + D[j], 0) + 1);
            }
        }

        int ans = 0;
        for (int sumAb : mapAB.keySet()) {
            if (mapCD.containsKey(-sumAb)) {
                ans += mapAB.get(sumAb) * mapCD.get(-sumAb);
            }
        }
        return ans;
    }

}
