package leetcode;

import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

public class Solution0120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        int row = triangle.size();
        int[] memo = new int[row];
        for (int i = 0; i < triangle.get(row - 1).size(); i++) {
            memo[i] = triangle.get(row - 1).get(i);
        }
        for (int layer = row - 2; layer >= 0; layer--) {
            for (int j = 0; j <= layer; j++) {
                memo[j] = Math.min(memo[j], memo[j+1]) + triangle.get(layer).get(j);
            }
        }
        return memo[0];
    }

}