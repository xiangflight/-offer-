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

    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            int n = (int) Math.pow(10, x);
            long startTime = System.nanoTime();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += i;
            }
            System.out.println("10^" + x + " : " + (System.nanoTime() - startTime) + " ns");
        }
    }
}
