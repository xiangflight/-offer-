package coding_interviews.swordoffer;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-13 22:52
 *
 * 连续子数组最大和
 *
 */

public class Solution34 {

    /**
     * 题目：输入一个整型数组，数组里有正数也有负数。数组中一个或连续
     *      的多个整数组成一个子数组。求所有子数组的和的最大值。要求
     *      时间复杂度为O(n)
     *
     * @param array 输入数组
     * @return 连续子数组最大和
     */
    public int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("Array must contain an element.");
        }
        int sum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int val: array) {
            curSum = (curSum <= 0) ? val: curSum + val;
            if (curSum > sum) {
                sum = curSum;
            }
        }
        return sum;
    }

}
