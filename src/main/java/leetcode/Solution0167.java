package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0167 {

    public int[] twoSum(int[] numbers, int target) {
        int p = 0, q = numbers.length - 1;
        while (p < q) {
            int sum = numbers[p] + numbers[q];
            if (sum == target) {
                return new int[] {p + 1, q + 1};
            }
            if (sum > target) {
                q--;
            } else {
                p++;
            }
        }
        return new int[0];
    }

}
