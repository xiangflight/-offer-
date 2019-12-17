package algo.dac;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/17
 *
 * 使用分治求逆序对
 */

public class ReversePair {

    private int count;

    private int[] aux;

    public int count(int[] nums, int n) {
        count = 0;
        aux = new int[n];
        mergeSortCount(nums, 0, n - 1);
        return count;
    }

    private void mergeSortCount(int[] nums, int p, int r) {
        if (p >= r) {
            return;
        }
        int mid = p + (r - p) / 2;
        mergeSortCount(nums, p, mid);
        mergeSortCount(nums, mid + 1, r);
        merge(nums, p, mid, r);
    }

    private void merge(int[] nums, int p, int mid, int r) {
        int i = p, j = mid + 1;
        Arrays.setAll(aux, index -> nums[index]);
        for (int k = p; k <= r; k++) {
            if (i > mid) {
                nums[k] = aux[j++];
            } else if (j > r) {
                nums[k] = aux[i++];
            } else if (aux[i] < aux[j]) {
                nums[k] = aux[i++];
            } else {
                count += (mid - i + 1);
                nums[k] = aux[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 2, 3, 4};
        final int count = new ReversePair().count(nums, nums.length);
        System.out.println(count);
    }

}
