package algo.sort;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 */

public class KthSmallest {

    public static int kthSmallest(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            return -1;
        }
        int q = partition(arr, 0, arr.length - 1);
        while (q + 1 != k) {
            if (q + 1 < k) {
                q = partition(arr, q + 1, arr.length - 1);
            } else {
                q = partition(arr, 0, q - 1);
            }
        }
        return arr[q];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int k = 2;
        final int ans = kthSmallest(arr, k);
        System.out.println(String.format("第 %d 小的元素是：%d", k, ans));
    }

    private static int partition(int[] arr, int p, int r) {
        int pivot = arr[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
