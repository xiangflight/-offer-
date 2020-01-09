package cc189;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/7
 */

public class Solution083 {

    public int magicIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int magicIndex2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 2, 3, 4, 7};
        int i = new Solution083().magicIndex(arr);
        System.out.println(i);
    }

}
