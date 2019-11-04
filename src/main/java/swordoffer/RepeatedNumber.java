package swordoffer;

import utils.Assert;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class RepeatedNumber {

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param num 输入数组
     * @return 重复数字
     */
    int repeatedUsingHashtable(int[] num) {
        Assert.checkNotEmpty(num);
        // take mem as cache, so index of mem is [0..n-1]
        int[] mem = new int[num.length];
        for (int n: num) {
            if (mem[n] != 0) {
                return n;
            }
            mem[n]++;
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

    /**
     * 时间复杂度 O(nlogn)
     * 空间复杂度 O(1)
     *
     * @param num 输入数组
     * @return 重复数字
     */
    int repeatedUsingSorting(int[] num) {
        assert num != null && num.length != 0;
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i+1]) {
                return num[i];
            }
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

    /**
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * in place operation
     *
     * @param num 输入数组
     * @return 重复数字
     */
    int repeatedInPlace(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[num[i]] < 0) {
                return num[i];
            }
            num[num[i]] = - num[num[i]];
        }
        throw new IllegalArgumentException("no repeated number exists in the array");
    }

}
