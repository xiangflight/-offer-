package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/11
 */

public class Solution067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;
        int[] nums = new int[4];
        while (sc.hasNext()) {
            int[] temp = new int[4];
            for (int i = 0; i < 4; i++) {
                nums[i] = sc.nextInt();
            }
            solution(nums, temp, result);
        }
        sc.close();
    }

    static void solution(int[] nums, int[] temp, double result) {
        boolean ans = check(nums, temp, result);
        System.out.println(ans);
    }

    static boolean check(int[] nums, int[] temp, double result) {
        for (int i = 0; i < nums.length; i++) {
            if (temp[i] == 0) {
                temp[i] = 1;
                if (check(nums, temp, result + nums[i])
                        || check(nums, temp, result - nums[i])
                        || check(nums, temp, result * nums[i])
                        || check(nums, temp, result / nums[i])) {
                    return true;
                }
                temp[i] = 0;
            }
        }
        return result == 24;
    }

}
