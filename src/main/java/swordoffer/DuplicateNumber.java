package swordoffer;

import utils.Assert;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class DuplicateNumber {

    int duplicateNumInArr(int[] arr) {
        Assert.checkNotEmpty(arr);
        int len = arr.length;
        int start = 1;
        int end = len - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            int count = countRange(arr, start, mid, len);
            if (start == end) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }
            if (count > (mid - start + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] arr, int start, int end, int length) {
        if (arr == null) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] >= start && arr[i] <= end) {
                cnt++;
            }
        }
        return cnt;
    }



}
