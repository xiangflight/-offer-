package ds;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class MinHeap {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3, 4, 5, 6, 4, 3, 1};
        new MinHeap().heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public void heapSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        buildHeap(arr);
        int k = n - 1;
        while (k > 0) {
            swap(arr, 0, k);
            heapify(arr, 0, --k);
        }
    }

    public void buildHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    private void heapify(int[] arr, int i, int n) {
        while (true) {
            int minPos = i;
            if (i * 2 + 1 <= n && arr[i * 2 + 1] < arr[i]) {
                minPos = i * 2 + 1;
            }
            if (i * 2 + 2 <= n && arr[i * 2 + 2] < arr[minPos]) {
                minPos = i * 2 + 2;
            }
            if (minPos == i) {
                break;
            }
            swap(arr, i, minPos);
            i = minPos;
        }
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
