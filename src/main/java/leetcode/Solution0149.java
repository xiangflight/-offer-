package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

public class Solution0149 {

    public int maxPoints(int[][] points) {
        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        int res = 0;

        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            int overLap = 0, max = 0;
            for (int j = i + 1; j < points.length; j++) {
                int x = points[i][0] - points[j][0];
                int y = points[i][1] - points[j][1];
                if (x == 0 && y == 0) {
                    overLap++;
                    continue;
                }
                int gcd = gcd(x, y);
                if (gcd != 0) {
                    x /= gcd;
                    y /= gcd;
                }
                String slope = String.valueOf(x) + y;
                int count = map.getOrDefault(slope, 0);
                count++;
                map.put(slope, count);
                max = Math.max(max, count);
            }
            res = Math.max(res, max + overLap + 1);
        }

        return res;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
