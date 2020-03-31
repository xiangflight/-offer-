package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/31
 *
 * 1 <= A.length <= 10000
 * -50000 <= A[i] <= 50000
 */

public class Solution0912 {

    public int[] sortArray(int[] nums) {
        int[] count = new int[100001];
        for (int num: nums) {
            count[num + 50000]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] != 0) {
                nums[j++] = i - 50000;
                count[i]--;
            }
        }
        return nums;
    }

}
