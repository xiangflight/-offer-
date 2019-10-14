package com.xiangflight.contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 10:49 上午
 */

public class Solution5223 {

    private Map<int[], Boolean> map = new HashMap<>();

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        for (int[] queue : queens) {
            if (validLoc(queue, king)) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(queue[0]);
                tmp.add(queue[1]);
                res.add(tmp);
            }
        }
        return res;
    }

    private boolean validLoc(int[] queue, int[] king) {
        return map.getOrDefault(queue, true) && (sameRow(queue, king) || sameCol(queue, king) || sameTilt(queue, king));
    }

    private boolean sameRow(int[] a, int[] b) {
        boolean same = a[0] == b[0];
        if (same) {
            if (a[1] > b[1]) {
                for (int i = a[1]; i < 8; i++) {
                    map.put(new int[] {a[0], i}, false);
                }
            } else if (a[1] < b[1]) {
                for (int i = a[1]; i >= 0; i--) {
                    map.put(new int[] {a[0], i}, false);
                }
            }
        }
        return same;
    }

    private boolean sameCol(int[] a, int[] b) {
        boolean same = a[1] == b[1];
        if (same) {
            if (a[0] > b[0]) {
                for (int i = a[0]; i < 8; i++) {
                    map.put(new int[] {i, a[1]}, false);
                }
            } else if (a[0] < b[0]) {
                for (int i = a[0]; i >= 0; i--) {
                    map.put(new int[] {i, a[1]}, false);
                }
            }
        }
        return same;
    }

    private boolean sameTilt(int[] a, int[] b) {
        boolean same = Math.abs(a[0] - b[0]) == Math.abs(a[1] - b[1]);
        if (same) {
            if (a[0] > b[0]) {
                if (a[1] > b[1]) {
                    for (int i = a[0]; i < 8; i++) {
                        for (int j = a[1]; j < 8; j++) {
                            map.put(new int[] {i, j}, false);
                        }
                    }
                } else {
                    for (int i = a[0]; i < 8; i++) {
                        for (int j = a[1]; j >= 0; j--) {
                            map.put(new int[] {i, j}, false);
                        }
                    }
                }
            } else {
                if (a[1] > b[1]) {
                    for (int i = a[0]; i >= 0; i--) {
                        for (int j = a[1]; j < 8; j++) {
                            map.put(new int[] {i, j}, false);
                        }
                    }
                } else {
                    for (int i = a[0]; i >= 0; i--) {
                        for (int j = a[1]; j >= 0; j--) {
                            map.put(new int[] {i, j}, false);
                        }
                    }
                }
            }
        }
        return same;
    }

}
