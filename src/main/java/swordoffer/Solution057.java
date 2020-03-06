package swordoffer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 * <p>
 * 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
 * <p>
 * 序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。
 * <p>
 * 示例 1：
 * <p>
 * 输入：target = 9
 * 输出：[[2,3,4],[4,5]]
 * <p>
 * ---------------------------------------------------------
 * <p>
 * 示例 2：
 * <p>
 * 输入：target = 15
 * 输出：[[1,2,3,4,5],[4,5,6],[7,8]]
 *
 * S: Scenario
 * A: Assumption
 * E: Example
 * T: Thought
 * C: Code
 * C: Complexity
 * T: Test
 *
 * Limit: 1 <= target <= 10^5
 *
 */

public class Solution057 {

    /**
     * 使用不定长滑动窗口
     *
     * @param target 窗口内值相加的和
     * @return 所有满足条件的窗口
     */
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int lo = 1, hi = 2;
        int sum = lo + hi;
        while (hi < target) {
            if (sum == target) {
                int[] element = new int[hi - lo + 1];
                for (int i = lo; i <= hi; i++) {
                    element[i - lo] = i;
                }
                res.add(element);
                // 整体右移
                sum -= lo;
                lo++;
                hi++;
                sum += hi;
            } else if (sum < target) {
                hi++;
                sum += hi;
            } else {
                sum -= lo;
                lo++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
