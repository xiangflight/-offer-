package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/1
 */

public class Solution11 {

    /**
     * brute force solution
     *
     * @param height height array
     * @return most water area
     */
    int maxAreaBf(int[] height) {
        if (height == null || height.length == 1) {
            return 0;
        }
        int maxArea = 0;
        int len = height.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                int curArea = (j - i) * Math.min(height[i], height[j]);
                if (curArea > maxArea) {
                    maxArea = curArea;
                }
            }
        }
        return maxArea;
    }

    int maxArea(int[] height) {
        if (height == null || height.length == 1) {
            return 0;
        }
        int len = height.length;
        int maxArea = -1;
        int maxHeightIndex = 0;
        int curMaxHeight = height[0];
        for (int i = 1; i < len; i++) {
            if (height[i] > curMaxHeight) {
                maxHeightIndex = i;
                curMaxHeight = height[i];
            }
            int maxHorizontalArea = i * Math.min(height[i], height[0]);
            int maxVerticalArea = (i - maxHeightIndex) * Math.min(height[i], curMaxHeight);
            maxArea = Math.max(maxArea, Math.max(maxHorizontalArea, maxVerticalArea));
        }
        return maxArea;
    }

}
