package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

public class Solution0435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // 按结束时间早的靠前
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        int n = intervals.length;
        int res = 1;
        int pre = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= intervals[pre][1]) {
                res++;
                pre = i;
            }
        }
        return n - res;
    }

}
