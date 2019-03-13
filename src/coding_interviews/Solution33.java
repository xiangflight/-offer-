package coding_interviews;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-13 22:09
 *
 * 最小的k个数
 *
 */

public class Solution33 {

    /**
     * 题目：输入n个整数，找出其中最小的k个数。例如输入
     *      4、5、1、6、2、7、3、8这8个数字，则最小的
     *      4个数字是1、2、3、4
     *
     *      使用partition方法将
     *
     * @param input 输入数组
     * @param k k值
     * @return 最小的k个数
     */
    public ArrayList<Integer> getLeastNumbers1(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length) {
            return result;
        }
        findKthSmallest(input, k - 1);
        for (int i = 0; i < k; i++) {
            result.add(input[i]);
        }
        return result;
    }

    /**
     * 找到第i小个数
     *
     * @param input 输入数组
     * @param i 第i小
     */
    private void findKthSmallest(int[] input, int i) {
        int l = 0, h = input.length - 1;
        while (l < h) {
            int pivot = partition(input, l, h);
            if (pivot == i) {
                break;
            }
            if (pivot > i){
                h = pivot - 1;
            } else {
                l = pivot + 1;
            }
        }
    }

    /**
     * 基于快速选择算法，将值放在第k小的位置
     *
     * @param input 输入数组
     * @param lo 开始位置
     * @param hi 结束位置
     * @return 返回分割的位置
     */
    private int partition(int[] input, int lo, int hi) {
        int v = input[lo];
        // input[lo...i) <= v; input(j...hi] >= v
        int i = lo + 1, j = hi;
        while (true) {
            while (i <= hi && input[i] < v) {
                i++;
            }
            while (j >= lo + 1 && input[j] > v) {
                j--;
            }
            if (i > j) {
                break;
            }
            swap(input, i, j);
            i++;
            j--;
        }
        swap(input, lo, j);
        return j;
    }

    /**
     * 交换i和j位置上的元素
     *
     * @param arr 输入数组
     * @param i 索引i
     * @param j 索引j
     */
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 当不能修改数组时，使用最大堆来实现
     *
     * @param input 输入的数组
     * @param k k值
     * @return 最小的k个数
     */
    public ArrayList<Integer> getLeastNumbers2(int [] input, int k) {
        if (input == null || input.length == 0 || input.length < k) {
            return new ArrayList<>();
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num: input) {
            maxHeap.add(num);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        final ArrayList<Integer> leastNumbers1 = new Solution33().getLeastNumbers1(arr, 1);
        for (int val: leastNumbers1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}
