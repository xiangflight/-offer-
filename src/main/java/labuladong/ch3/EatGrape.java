package labuladong.ch3;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class EatGrape {

    long solution(long a, long b, long c) {
        long[] nums = {a, b, c};
        Arrays.sort(nums);

        long sum = a + b + c;

        if (nums[0] + nums[1] > nums[2]) {
            return (sum + 2) / 3;
        }

        if (2 * (nums[0] + nums[1]) < nums[2]) {
            return (nums[2] + 1) / 2;
        }
        return (sum + 2) / 3;
    }

}
