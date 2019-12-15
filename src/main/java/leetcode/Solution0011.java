package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/1
 */

public class Solution0011 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int capacity = Math.min(height[i], height[j]) * (j - i);
                if (capacity > maxArea) {
                    maxArea = capacity;
                }
            }
        }
        return maxArea;
    }

    public int maxAreaTwoPointer(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

}