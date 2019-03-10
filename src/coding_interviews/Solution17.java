package coding_interviews;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-10 09:14
 *
 * 调整数组顺序使奇数位于偶数前面
 *
 */

public class Solution17 {

    /**
     * 题目：输入一个整型数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于
     *      数组的前半部分，所有偶数位于数组的后半部分
     *
     * @param array 数组
     */
    public void reOrderArray1(int [] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int i = 0, j = array.length - 1;
        while (true) {
            while (isOdd(array[i]) && i < j) {
                i++;
            }
            while (isEven(array[j]) && i < j) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(array, i, j);
            i++;
            j--;
        }
    }

    /**
     * 保持奇数与奇数，偶数与偶数之间的顺序不变
     *
     * @param array 数组
     */
    public void reOrderArray2(int [] array) {
        int oddCnt = 0;
        for (int a: array) {
            if (isOdd(a)) {
                oddCnt++;
            }
        }
        int[] newArr = array.clone();
        int i = 0, j = oddCnt;
        for (int a: newArr) {
            if (isOdd(a)) {
                array[i++] = a;
            } else {
                array[j++] = a;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    private boolean isOdd(int a) {
        return (a & 0x1) != 0;
    }

    private boolean isEven(int a) {
        return (a & 0x1) == 0;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int[] arr = {1,2,3,4,5,6,7,8};
        solution17.reOrderArray2(arr);
        for (int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
