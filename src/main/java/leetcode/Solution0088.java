package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0088 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int p = m - 1;
        int q = n - 1;
        while (p >= 0 && q >= 0) {
            if (nums1[p] > nums2[q]) {
                nums1[i--] = nums1[p];
                p--;
            } else {
                nums1[i--] = nums2[q];
                q--;
            }
        }
        while (q >= 0) {
            nums1[i--] = nums2[q--];
        }

        // a simple solution
        // int i = m - 1, j = n - 1, k = m + n - 1;
        // while (j >= 0) {
        //     nums1[k--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--]: nums2[j--];
        // }
    }

}
