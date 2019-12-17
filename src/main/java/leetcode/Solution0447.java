package leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

public class Solution0447 {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            map.clear();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    int distance = distance(points[i], points[j]);
                    map.put(distance, map.getOrDefault(distance, 0) + 1);
                }
            }
            for (int count: map.values()) {
                res += count * (count - 1);
            }
        }
        return res;
    }

    public int distance(int[] point1, int[] point2) {
        return (int) (Math.pow(point1[1] - point2[1], 2) + Math.pow(point1[0] - point2[0], 2));
    }

}
