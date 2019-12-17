package algo.sort;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/24
 */

public class SelectionSort implements ISort {

    @Override
    public void sortAscend(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
}
