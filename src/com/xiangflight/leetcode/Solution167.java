package com.xiangflight.leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/11 8:39 上午
 */

public class Solution167 {

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i + 1, j + 1};
                }
            }
        }
        return new int[2];
    }

    public int[] twoSum1(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[2];
    }

    public int[] twoSum2(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[] {i + 1, j + 1};
            }
        }
        return new int[2];
    }

}
